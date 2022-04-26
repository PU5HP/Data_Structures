class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n=digits.size();
        if(digits[n-1]!=9){
            digits[n-1]++;
            return digits;
        }
        else{
            int carry=1;int idx=n-1;
            while(idx>=0){
                if(digits[idx]+carry==10)
                  {
                    digits[idx]=0;
                    carry=1;
                }
                else{
                    digits[idx]=digits[idx]+carry;
                    carry=0;
                    break;
                }
                idx--;
            }
            if(carry==1){
                digits.insert(digits.begin(), 1);
            }
        }
        return digits;
    }
};
