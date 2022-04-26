class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int old_row=mat.length;
        int old_col=mat[0].length;
        if(r*c!=old_row*old_col || (r==old_row && c==old_col))
        {return mat;}
        //traversing the old matrix anf filling new matrix
        int [][] newMatrix = new int [r][c];
            for(int i=0;i<r*c;i++){
                newMatrix[i/c][i%c]=mat[i/old_col][i%old_col];
            }
             return newMatrix;
}}
