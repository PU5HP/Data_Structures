1662. Check If Two String Arrays are Equivalent
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        for(String it : word1){
            a=a+it;
        }
        String b="";
        for(String it : word2){
            b=b+it;
        }
        System.out.println(a);
        System.out.println(b);
        return a.equals(b);
    }
}
