// Last updated: 8/13/2026, 9:25:28 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int row=board.length;
4        int col=board[0].length;
5        boolean found=false;
6        boolean[][] visited=new boolean[row][col];
7        for(int i=0;i<row;i++){
8            for(int j=0;j<col;j++){
9                if(board[i][j]==word.charAt(0)){
10                        found=find(board,word,0,i,j,visited);
11                }
12                if(found) return true;
13            }
14        }
15        return false;
16    }
17    private boolean find(char[][] board,String word,int i,int r,int c, boolean[][] visited){
18        if (i==word.length())
19            return true;
20        if(r>board.length-1 || c>board[0].length-1 || r<0 || c<0)
21            return false;
22        if(board[r][c]!= word.charAt(i))
23            return false;
24        if(visited[r][c]) return false;
25        visited[r][c]=true;
26        boolean up=find(board, word, i+1,r-1,c ,visited );
27        boolean down=find(board, word, i+1, r+1,c, visited);
28        boolean left=find(board, word, i+1, r,c-1, visited);
29        boolean right=find(board, word, i+1, r,c+1, visited);
30        visited[r][c]=false;
31        if(up || down || right || left ) return true;
32        return false;
33    }
34}