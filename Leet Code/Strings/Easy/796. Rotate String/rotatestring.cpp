class Solution {
public:
    bool rotateString(string s, string goal) {
         for(int i=0;i<s.length();i++){
             int st=1;int e=s.length()-1;
             while(st<e)
        {
            char temp=s[st];
            s[st]=s[e];
            s[e]=temp;
            st++;
            e--;
        }
             int st2=0;int e2=s.length()-1;
             while(st2<e2)
        {
            char temp=s[st2];
            s[st2]=s[e2];
            s[e2]=temp;
            st2++;
            e2--;
        }
             
             if(s==goal){
                 return true;
             }
             cout<<s<<endl;
         }
        return false;
    }
};
