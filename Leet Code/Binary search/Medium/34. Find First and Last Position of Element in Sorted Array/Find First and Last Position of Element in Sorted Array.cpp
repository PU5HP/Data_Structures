//it is the use for binary search algorithm 
//the flag here is used to handle the case in which element is not present 
//if the element is present there we set the flag as true and return the value
//if flag is false we return -1;

class Solution {
public:
    int firstOccurence(vector<int>& nums,int target){
        int st=0;int end=nums.size()-1;bool flag=false;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid]==target){   //note
                flag=true;
            }
            if(nums[mid]>=target){   //note
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        }
        if(flag==true)              //note
        {return st;}
        return -1;
    }
    int lastOccurence(vector<int>& nums,int target){
        int st=0;int end=nums.size()-1;bool flag=false;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid]==target){     //note
                flag=true;
            }
            if(nums[mid]>target){
                end = mid-1;          //note
            }
            else{                     //note
                st=mid+1;
            }
        }
        if(flag==true)               //note
        {return end;}
        return -1;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int>ans;
        ans.push_back(firstOccurence(nums,target));
        ans.push_back(lastOccurence(nums,target));
        return ans;
    }
};
