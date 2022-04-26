class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroFirstrow=false;
  // traversing the first Row
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<cols;i++){
          if(matrix[0][i]==0){
            zeroFirstrow = true;
          }
        }
      
  //traversing the matrix from 2nd row and setting first row values zeros when we encounter zero
      for(int i=1;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(matrix[i][j]==0){
            matrix[0][j]=0;
          }
        }
      }
      
//setting rows zeros with starting row is 1
      for(int i=1;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(matrix[i][j]==0){
            for(int c=0;c<cols;c++){
              matrix[i][c]=0;
            }
            break;
          }
        }
      }
  //trversing the first row and setting coluns to zeros
      for(int i=0;i<cols;i++){
        if(matrix[0][i]==0){
          for(int j=0;j<rows;j++){
            matrix[j][i]=0;
          }
        }
      }
    //checking the first row zero
      if(zeroFirstrow==true){
        for(int i=0;i<cols;i++){
          matrix[0][i]=0;
        }
      }
    
    }
}
