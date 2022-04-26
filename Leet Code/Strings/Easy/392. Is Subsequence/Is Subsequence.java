class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1=s.length()-1;
        int p2=t.length()-1;
        if(p1<0){
            return true;
        }
        int count=0;
        while(p1>=0 && p2>=0){
            if(s.charAt(p1)==t.charAt(p2)){
                count++;p1--;p2--;
                if(count==s.length() && p1==-1){
                    return true;
                }
            }
            else{
                p2--;
            }
        }
        return false;
    }
}
