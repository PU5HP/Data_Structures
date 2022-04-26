class Solution {
  
    public boolean traversedaigonal(int element,int i,int j,int [][]matrix){
      
      while(i<matrix.length&&j<matrix[0].length){
        if(matrix[i][j]!=element){
          return false;
        }
        i++;j++;
      }
      return true;
      
    }
  
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
      if(rows==1 || cols==1){
        return true;
       }
      
      //top
      for(int c=0;c<cols;c++){
        int element=matrix[0][c];
        boolean ans =traversedaigonal(element,0,c,matrix);
         if(ans==false){
            return false;
          }
      }
      
      
      //left
        for(int r=1;r<rows;r++){
          int element=matrix[r][0];
          boolean ans = traversedaigonal(element,r,0,matrix);
          if(ans==false){
            return false;
          }
        }
      
      return true;
    }
}
