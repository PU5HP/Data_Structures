#include<iostream>
#include<vector>
using namespace std;

bool checkNumber(int num){
    int ognum=num;
    while(num!=0){
        int element = num%10;
        if(element==0 ||ognum%element!=0){
            return false;
        }
        num=num/10;
    }
    return true;
}

vector<int> selfDividingNumbers(int left, int right) {
    vector<int>v;
        for(int num=left;num<=right;num++){
            int checkedNumber = checkNumber(num);
            if(checkedNumber==true){
               v.push_back(num);
            }
        }
        return v;
}


int main(){
    int left;
    cout<<"Enter the starting value:"<<endl;
    cin>>left;
    int right;
    cout<<"Enter the Ending value:"<<endl;
    cin>>right;
    vector<int>ans=selfDividingNumbers(left,right);
    cout<<"the answer is as:";
    for(auto it : ans){
        cout<<it<<" ";
    }
    //[1,2,3,4,5,6,7,8,9,11,12,15,22]
    //[48,55,66,77]
}