Steps 
1. Apply Binary search to the column=0 and variable rows
2. find the valid row by checking that the element lies between the first and the last element of the row 
3.if (2 is true ) return the row
4.apply the binary search in that row to find the element



class Solution {
    public int validrow(int [][] matrix,int target){
      int rows=matrix.length,cols=matrix[0].length;
      int sr=0;
      int er=rows-1;
      int mid=0;
      while(sr<=er){
        mid=(sr+er)/2;
        if(target>=matrix[mid][0] && target<=matrix[mid][cols-1]){
          return mid;
        }
        else if(target>matrix[mid][0]){
          sr=mid+1;
        }
        else{
          er=mid-1;
        }
      }
      return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =validrow(matrix,target);
      if(row==-1){
        return false;
      }
      else{
        int sc=0,ec=matrix[0].length-1;
        while(sc<=ec){
          int mid=(sc+ec)/2;
          if(matrix[row][mid]>target){
            ec=mid-1;
          }
          else if(matrix[row][mid]<target){
            sc=mid+1;
          }
          else{
            return true;
          }
          
        }
      }
      return false;
      
    }
}
