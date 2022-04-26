class Solution {
public:
    int thirdMax(vector<int>& nums) {
        //created a set and set stores element in ascending order
        set<int>s;
        for(auto it:nums){
            s.insert(it);
        }
        //puttting set values to a vector to access by the index
        vector<int>vec;
        for(auto it:s){
            vec.insert(vec.begin(),it);
        }
        if(vec.size()==1){
            return vec[0];
        }
        else if(vec.size()==2){
            return vec[0];
        }
        return vec[2];
    }
};
