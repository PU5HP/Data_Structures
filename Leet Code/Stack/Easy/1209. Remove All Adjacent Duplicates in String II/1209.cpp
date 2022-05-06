#include<iostream>
#include<stack>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;

string removeDuplicates(string s, int k) {
    vector<pair<char,int>> st;
    for(auto ch : s){
        if(st.empty() || st.back().first!=ch){
           st.push_back({ch,1});
        }
        else
        {
            st.back().second++;
            if(st.back().second==k){
                st.pop_back();
            }
        }
    }
    string result ="";
    for(auto it : st){
        result.append(it.second,it.first);
    }
    return result;
}




int main(){
    string str;int k;
    cout<<"enter the string"<<endl;
    cin>>str;
    cout<<"Enter the number"<<endl;
    cin>>k;
    string ans = removeDuplicates(str, k) ;
    cout<<ans;
}
