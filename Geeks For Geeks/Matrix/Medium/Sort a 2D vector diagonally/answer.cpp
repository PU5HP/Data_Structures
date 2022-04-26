https://practice.geeksforgeeks.org/problems/diagonal-morning-assembly0028/1/#
 void diagonalSort(vector<vector<int> >& mat, int n, int m) {
        // code here 
         vector<int>temp;
        vector<int>ans;
        int rows=mat.size();
        int cols=mat[0].size();
        for(int r=rows-1;r>0;r--){
            int c=0;int x=r;
            while(x<=rows-1 && c<=cols-1){
                temp.push_back(mat[x][c]);
                x++;c++;
            }
            sort(temp.begin(),temp.end());
            ans.insert(ans.end(),temp.begin(),temp.end());
            temp.clear();
        }
        int x=0;int y=0;
        while(x<=rows-1 && y<=cols-1){
                temp.push_back(mat[x][y]);
                x++;y++;
            }
        ans.insert(ans.end(),temp.begin(),temp.end());   //verry verry important
            temp.clear();
        
        for(int c=1;c<=cols-1;c++){
           int r=0;int x=c;
           while(r<=rows-1 && x<=cols-1){
              temp.push_back(mat[r][x]);
               r++;x++;
           }
           sort(temp.begin(),temp.end(),greater<int>()); //verrry important 
           ans.insert(ans.end(),temp.begin(),temp.end());
           temp.clear();
        }
        //for(int i=0;i<ans.size();i++){
        //    cout<<ans[i]<<endl;
        //}
        int idx=0;
        for(int r=rows-1;r>0;r--){
            int c=0;int x=r;
            while(x<=rows-1 && c<=cols-1){
                mat[x][c]=ans[idx];
                x++;c++;idx++;
            }
        }
        int xx=0;int yy=0;
        while(xx<=rows-1 && yy<=cols-1){
                mat[xx][yy]=ans[idx];
                xx++;yy++;idx++;
            }
        for(int c=1;c<=cols-1;c++){
           int r=0;int x=c;
           while(r<=rows-1 && x<=cols-1){
              mat[r][x]=ans[idx];
               r++;x++;idx++;
           }
        }
        
       // return mat;
    }
