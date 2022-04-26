class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length,cols=mat[0].length,idx=0,r=0,c=0;
        int [] result = new int [rows*cols];
        boolean up = true , down =false;
        int total = rows*cols;
        //we have two cases 
        //1.up is true we move down to up
        //2.down is true we move up to down
        //3.idx is element which tracks the index of the array
        
        
        while(idx<total){
            
            if(up==true){
                // logic for moving down to up
                while(r>=0 && c<cols){
                    result[idx]=mat[r][c];
                    idx=idx+1;r=r-1;c=c+1;
                }
                //back to the valid element index
                r=r+1;c=c-1;
                //if column is the last then increment the row
                if(c==cols-1){
                    r=r+1;
                }
                else{
                    c=c+1;
                }
                down=true;
            }
            
            if(down==true){
                // logic for moving up to down
                while(r<rows && c>=0){
                    result[idx]=mat[r][c];
                    idx=idx+1;r=r+1;c=c-1;
                }
                //back to the valid element index
                c=c+1;r=r-1;
                // if the row is the last then column increment 
                if(r==rows-1){
                    c=c+1;
                }
                else{
                    r=r+1;
                }
                up=true;
            }
         
        }
        return result;
    }
}498. Diagonal Traverse
