// Last updated: 3/29/2026, 8:12:36 AM
1class Solution {
2    // parent[i] = parent of node i in DSU
3    private int[] parent;
4    // rank[i] = rank for union by rank optimization
5    private int[] rank;
6    // parity[i] = XOR distance from node i to its root
7    // parity[i] = 0 means i and root have same "color"
8    // parity[i] = 1 means i and root have different "color"
9    private int[] parity;
10
11    /**
12     * Find root of node x with path compression.
13     * Also updates parity[x] to be the XOR distance from x to its root.
14     * @param x the node to find root for
15     * @return root of x
16     */
17    private int find(int x) {
18        if (parent[x] == x) return x;
19        
20        int root = find(parent[x]);
21        // XOR parity of x with parity of its parent to get distance to root
22        parity[x] ^= parity[parent[x]];
23        parent[x] = root; // path compression
24        return root;
25    }
26
27    /**
28     * Main method: returns number of edges successfully added.
29     * 
30     * An edge (u, v, w) can be added if:
31     * 1. u and v are in different components (no cycle created), OR
32     * 2. u and v are in same component AND parity[u] XOR parity[v] == w
33     *    (the cycle formed would have even weight sum)
34     *
35     * Time Complexity:  O(E * α(N)) where α is inverse Ackermann (near-constant)
36     * Space Complexity: O(N)
37     */
38    public int numberOfEdgesAdded(int n, int[][] edges) {
39        // Input validation
40        if (n <= 0 || edges == null || edges.length == 0) return 0;
41
42        parent = new int[n];
43        rank = new int[n];
44        parity = new int[n];
45
46        // Initialize DSU: each node is its own parent, parity = 0
47        for (int i = 0; i < n; i++) {
48            parent[i] = i;
49            rank[i] = 0;
50            parity[i] = 0;
51        }
52
53        int count = 0;
54
55        for (int[] edge : edges) {
56            int u = edge[0], v = edge[1], w = edge[2];
57
58            // Validate edge inputs
59            if (u < 0 || u >= n || v < 0 || v >= n || (w != 0 && w != 1)) continue;
60
61            int rootU = find(u);
62            int rootV = find(v);
63
64            if (rootU != rootV) {
65                // Different components: safe to add, no cycle created
66                count++;
67                // Union by rank
68                if (rank[rootU] < rank[rootV]) {
69                    // Make rootV the parent of rootU
70                    parent[rootU] = rootV;
71                    // parity[rootU] must satisfy: parity[u] XOR parity[rootU] XOR parity[v] = w
72                    // => parity[rootU] = parity[u] XOR parity[v] XOR w
73                    parity[rootU] = parity[u] ^ parity[v] ^ w;
74                } else if (rank[rootU] > rank[rootV]) {
75                    // Make rootU the parent of rootV
76                    parent[rootV] = rootU;
77                    // parity[rootV] = parity[u] XOR parity[v] XOR w
78                    parity[rootV] = parity[u] ^ parity[v] ^ w;
79                } else {
80                    // Same rank: make rootV parent of rootU, increase rootV rank
81                    parent[rootU] = rootV;
82                    parity[rootU] = parity[u] ^ parity[v] ^ w;
83                    rank[rootV]++;
84                }
85            } else {
86                // Same component: check if adding creates an odd-weight cycle
87                // The cycle weight = parity[u] XOR parity[v] XOR w
88                // Add only if cycle weight == 0 (even)
89                if ((parity[u] ^ parity[v]) == w) {
90                    count++;
91                    // No structural change to DSU needed
92                }
93                // else: skip this edge (would create odd cycle)
94            }
95        }
96
97        return count;
98    }
99}