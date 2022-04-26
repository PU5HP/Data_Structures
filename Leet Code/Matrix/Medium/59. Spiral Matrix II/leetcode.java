class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int [n][n];
        int rmin=0;
        int rmax=n-1;
        int cmin=0;
        int cmax=n-1;
        int total=n*n;
        int traversed=1;

        while(traversed<=total)
        {   
            //------------>
            for(int c=cmin;c<=cmax && traversed<=total ;c++){
                matrix[rmin][c]=traversed;
                traversed+=1;
            }
            
            
            for(int r=rmin+1;r<=rmax && traversed<=total ;r++ ){
                matrix[r][cmax]=traversed;
                traversed+=1;
            }
            
            for(int c=cmax-1;c>=cmin && traversed<=total ; c--){
                matrix[rmax][c]=traversed;
                traversed+=1;
            }
            
            for(int r=rmax-1;r>=rmin+1 && traversed<=total ; r--){
                matrix[r][cmin]=traversed;
                traversed+=1;
            }
            rmin++;cmin++;cmax--;rmax--;
            
        }
        return matrix;
    }
}
