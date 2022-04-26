// Steps
//1.traverse the left border from the bottom to top
//2.push_back the elements of the daigonal to a vector 
//3.after iteration sort the array and insert this array to a new vector
//4.do the above steps for the top row
//5.the answer will be in ans vector
//travrese the matrix and fill from the vector

class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
        vector<int>temp;
        vector<int>ans;
        int rows=mat.size();
        int cols=mat[0].size();
        for(int r=rows-1;r>=0;r--){
            int c=0;int x=r;
            while(x<=rows-1 && c<=cols-1){
                temp.push_back(mat[x][c]);
                x++;c++;
            }
            sort(temp.begin(),temp.end());
            ans.insert(ans.end(),temp.begin(),temp.end());
            temp.clear();
        }
        for(int c=1;c<=cols-1;c++){
           int r=0;int x=c;
           while(r<=rows-1 && x<=cols-1){
              temp.push_back(mat[r][x]);
               r++;x++;
           }
           sort(temp.begin(),temp.end());
           ans.insert(ans.end(),temp.begin(),temp.end());
           temp.clear();
        }
        for(int i=0;i<ans.size();i++){
            cout<<ans[i]<<endl;
        }
        int idx=0;
        for(int r=rows-1;r>=0;r--){
            int c=0;int x=r;
            while(x<=rows-1 && c<=cols-1){
                mat[x][c]=ans[idx];
                x++;c++;idx++;
            }
        }
        for(int c=1;c<=cols-1;c++){
           int r=0;int x=c;
           while(r<=rows-1 && x<=cols-1){
              mat[r][x]=ans[idx];
               r++;x++;idx++;
           }
        }
        
        return mat;
    }
};
