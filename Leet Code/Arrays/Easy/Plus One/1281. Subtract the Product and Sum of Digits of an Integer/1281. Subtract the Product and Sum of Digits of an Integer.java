class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        vector<int>digits;
        while(n>0){
            digits.push_back(n%10);
            n=n/10;
        }
        for(int i=0;i<digits.size();i++){
            sum=sum+digits[i];
            product=product*digits[i];
        }
        return product-sum;
    }
};
