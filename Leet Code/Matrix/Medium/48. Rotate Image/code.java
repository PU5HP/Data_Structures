48. Rotate Image
11 12 13 14                                          
21 22  23 24
31 32  33 34    ---------->transpose(upper triangular swap)
41 42  43 44

11 21 31 41
12 22 32 42
13 23 33 43    -----------------> reverse rows (0-->n-1)
14 24 34 44

41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14

  
  class Solution {
    
    //swap used for the transpose && reverse function
    public void swap(int [][]matrix ,int x,int y){
              int temp    = matrix[x][y];
              matrix[x][y]=matrix[y][x];
              matrix[y][x]=temp;
    }
    
    
    //1.interchanging rows and cols logic
    
    public void transpose(int [][] matrix){
        for(int r=0;r<matrix.length-1;r++){               //important logic
            for(int c=r+1;c<matrix.length;c++){
                swap(matrix,r,c);
            }
        }
    }
    
    //2.reverse the rows of the matrix
    public void reverse(int [][] matrix,int row){
        int low=0;int high=matrix.length-1;
        while(low<high){
            int t=matrix[row][low];
            matrix[row][low]=matrix[row][high];
            matrix[row][high]=t;
            low++;high--;
        }
    }
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
        
    }
}
