Boundary Elements of Matrix 
class Solution
{
    public int[] BoundaryElements(int[][] mat)
    {
        // code here
        int idx=0;
        int rows=mat.length,cols=mat[0].length;
        if(rows==1){
            int [] asn=new int [cols];
            for(int i=0;i<cols;i++){
                asn[i]=mat[0][i];
            }
            return asn;
        }
        
        
        else{
        //top
        int [] ans = new int [2*(rows+cols)-4];
        for(int r=0;r<rows;r++){
            for(int j=0;j<cols;j++){
                if(r==0 || j==0 || j==cols-1 ||r==rows-1){
                    ans[idx]=mat[r][j];
                    idx++;
                }
            }
        }
        
        return ans;
}
    }
}
