class Solution {
    public int maxRow(int [][] matrix ,int row){
        int max=0;
        for(int i=0;i<matrix[0].length;i++){
            max+=matrix[row][i];
        }
        return max;
    }
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int new_max = maxRow(accounts,i);
            max =(new_max > max) ? new_max :max;
        }
        return max;
    }
}
