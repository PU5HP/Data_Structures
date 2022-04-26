https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1#
//how to return and insert in pair
class Solution
{
    public:
long long firstOccurence(vector<long long>nums,long long target){
        long long st=0;long long end=nums.size()-1;bool flag=false;
        while(st<=end){
            long long mid = (st+end)/2;
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
    long long lastOccurence(vector<long long>& nums,long long target){
        long long st=0;long long end=nums.size()-1;bool flag=false;
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
    pair<long,long> indexes(vector<long long> v, long long x)
    {
        // code here
        pair<long,long>ans;
        ans.first = (firstOccurence(v,x));
        ans.second =(lastOccurence(v,x));
        return ans;
    }
};
