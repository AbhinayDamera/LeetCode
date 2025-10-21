class Solution {
    public int islandPerimeter(int[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int per=0;

        for(int row=0 ; row<nr ; row++){
            for(int col=0 ; col<nc ; col++){
                if(grid[row][col]==1){
                    per=per+4;
                    if(col>0){
                    if(grid[row][col-1]==1){//left
                        per=per-2;
                    }
                    }
                    if(row>0){
                    if(grid[row-1][col]==1){//top
                        per=per-2;
                    }
                    }
                }
                
            }
        }
        return per;
    }
}