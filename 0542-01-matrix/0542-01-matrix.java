class Pair{
    int row;
    int col;
    int len;
    public Pair(int row,int col,int len){
        this.row = row;
        this.col = col;
        this.len = len;
    }
}
class Solution {
    public void bfs(int[][] mat,boolean[][] visited,int[][] distance){
        Queue<Pair> qu = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                    qu.offer(new Pair(i,j,0));
                }
            }
        }

        while(!qu.isEmpty()){
            int row = qu.peek().row;
            int col = qu.peek().col;
            int len = qu.peek().len;
            qu.poll();
            distance[row][col] = len;
            //top->row-1; down->row+1; right->col+1; left->col-1
            if(row-1 >= 0 && visited[row-1][col] == false && mat[row-1][col] != 0){
                visited[row-1][col] = true;
                qu.offer(new Pair(row-1,col,len+1));
            }
            //down
            if(row+1 < m && visited[row+1][col] == false && mat[row+1][col] != 0){
                visited[row+1][col] = true;
                qu.offer(new Pair(row+1,col,len+1));
            }
            //right
            if(col+1 < n && visited[row][col+1] == false && mat[row][col+1] != 0){
                visited[row][col+1] = true;
                qu.offer(new Pair(row,col+1,len+1));
            }
            //left
            if(col-1 >= 0 && visited[row][col-1] == false && mat[row][col-1] != 0){
                visited[row][col-1] = true;
                qu.offer(new Pair(row,col-1,len+1));
            }
        }

    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited= new boolean[m][n];
        int[][] distance = new int[m][n];
        bfs(mat,visited,distance);
        return distance;
    }
}