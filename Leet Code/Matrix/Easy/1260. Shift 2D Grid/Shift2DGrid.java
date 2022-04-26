class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        if(grid[0].size()==1 && 1==grid.size()){
            return grid;
        }
        k=k%(grid[0].size()*grid.size());
        vector<vector<int>>ans =grid;
        vector<int>arr;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                arr.push_back(grid[i][j]);
            }
        }
        reverse(arr.begin(),arr.end()-k);
        reverse(arr.begin()+arr.size()-k,arr.end());
        reverse(arr.begin(),arr.end());
        
        int index=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                ans[i][j]=arr[index];index++;
            }
        }
        
        return ans;
    }
};
