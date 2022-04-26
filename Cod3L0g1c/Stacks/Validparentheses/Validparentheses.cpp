//s = "()"
//s = "()[]{}"
//s = "(]"
#include<iostream>
#include<string>
#include<stack>
using namespace std;
  bool isValid(string s) {        
       stack<int>st;
        for(int i=0;i<s.length();i++){
            if(s[i]=='['||s[i]=='{'||s[i]=='('){
               st.push(s[i]);
            }
            else{   
                if(st.empty()==true){
                    return false;
                }
                else if(st.empty()!=true && ((st.top()=='[' && s[i]==']' )|| (st.top()=='{' && s[i]=='}' ) || (st.top()=='(' && s[i]==')' )))
                    {
                        st.pop();
                    }
                else{
                    return false;
                }
            }
        }
        if(st.empty()==true)
        {
            return true;
        }
    return false;
}
int main(){
    //input a string
    cout<<"Enter the string:"<<endl;
    string s;
    cin>>s;
    //call the isValid function
    bool ans = isValid(s);
    cout<<"The string is :"<<ans;

    return 0;
}