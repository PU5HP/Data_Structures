#include<iostream>
using namespace std;
//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, and 14 are all divisors of 28.
bool checkPerfectNumber(int num) {
    int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
           sum+=i;
        }
    }
    if(sum==num){return true;}
    return false;
}
int main(){
    int num;
    cout<<"enter the number:"<<endl;
    cin>>num;
    bool ans = checkPerfectNumber(num);
    cout<<"Answer:"<<ans;
}