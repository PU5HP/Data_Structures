class Solution {
  
   public void reverse(int [][] matrix,int s ,int e ,int row_no){
     //traversing row-wise
    while(s<e){
      int temp=matrix[row_no][s];
      matrix[row_no][s]=matrix[row_no][e];
      matrix[row_no][e]=temp;
      s++;e--;
    }
   }
  
    public int[][] flipAndInvertImage(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
       for(int i=0;i<rows;i++){
         reverse(matrix,0,cols-1,i);
       }
      //flipping
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(matrix[i][j]==0){
            matrix[i][j]=1;
          }
          else{
            matrix[i][j]=0;
          }
        }
      }
      return matrix;
    }
}
