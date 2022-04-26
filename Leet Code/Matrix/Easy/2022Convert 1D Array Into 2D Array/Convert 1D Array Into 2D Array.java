2022. Convert 1D Array Into 2D Array
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(m*n < original.length || m*n > original.length){
            int [][] empty=new int [0][0];
            return empty;
        }
        
        int idx=0;
        int [][] mat=new int [m][n];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                mat[r][c]=original[idx];
                idx++;
            }
        }
        
        return mat;
    }
}
