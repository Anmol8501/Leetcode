// Last updated: 3/29/2026, 8:14:40 AM
1import java.util.*;
2
3class EventManager {
4
5    // TreeSet ordered by: highest priority first, then smallest eventId (tie-break)
6    private final TreeSet<int[]> pq;
7
8    // eventId -> current priority (only contains ACTIVE events)
9    private final HashMap<Integer, Integer> priorityMap;
10
11    public EventManager(int[][] events) {
12        // Use Integer.compare to avoid overflow bugs
13        pq = new TreeSet<>((a, b) -> {
14            int cmp = Integer.compare(b[0], a[0]); // descending priority
15            if (cmp != 0) return cmp;
16            return Integer.compare(a[1], b[1]);     // ascending eventId (tie-break)
17        });
18
19        priorityMap = new HashMap<>();
20
21        for (int[] event : events) {
22            int eventId  = event[0];
23            int priority = event[1];
24            priorityMap.put(eventId, priority);
25            pq.add(new int[]{priority, eventId});
26        }
27    }
28
29    public void updatePriority(int eventId, int newPriority) {
30        // No-op if event was already polled or never existed
31        if (!priorityMap.containsKey(eventId)) return;
32
33        int oldPriority = priorityMap.get(eventId);
34
35        // Must remove BEFORE updating map — we need old priority to locate the node
36        pq.remove(new int[]{oldPriority, eventId});
37
38        // Re-insert with new priority
39        priorityMap.put(eventId, newPriority);
40        pq.add(new int[]{newPriority, eventId});
41    }
42
43    public int pollHighest() {
44        if (pq.isEmpty()) return -1;
45
46        int[] top     = pq.pollFirst();   // highest priority, smallest eventId
47        int   eventId = top[1];
48
49        priorityMap.remove(eventId);      // mark as no longer active
50        return eventId;
51    }
52}