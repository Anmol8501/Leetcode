// Last updated: 3/7/2026, 10:14:07 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();

        int row=matrix.length;
        int col=matrix[0].length; 
        int x=0,y=0,dx=0,dy=1;

        for(int i = 0; i < row * col; i++){
            list.add(matrix[x][y]);
            matrix[x][y]=101;
            
            int nx = x + dx;
            int ny = y + dy;

            if(nx < 0 || ny < 0 || nx >= row || ny >= col || matrix[nx][ny] == 101){
                int temp=dx;
                dx=dy;
                dy=-temp;
            }
            x+=dx;
            y+=dy;
        }
        return list;
    }
}