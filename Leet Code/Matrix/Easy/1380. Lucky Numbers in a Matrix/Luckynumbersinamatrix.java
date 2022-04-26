class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
      ArrayList<Integer> ans= new ArrayList <Integer>();
        int rows=matrix.length;
        int cols=matrix[0].length;
      int temp=0;
        
        for(int row=0;row<rows;row++){
            int r_min=200000;
            int c_max=-200000;
            for(int col=0;col<cols;col++){
                if(matrix[row][col]<r_min){
                  r_min=matrix[row][col];
                  temp=col;
                }
            }
          for(int i=0;i<rows;i++){
            if(matrix[i][temp]>c_max){
              c_max = matrix[i][temp];
            }
            
          }
          if(c_max==r_min){
            ans.add(c_max);
          }
        }
      
          return ans;
    }
}
