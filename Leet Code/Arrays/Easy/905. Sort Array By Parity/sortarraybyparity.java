import java.util.*;
class sortarraybyparity{

    public static int[] sortArrayByParity(int[] nums) {
        //2 pointer approach
        
        int st =0;int end =nums.length-1;
        while(st<=end){
            if(nums[st]%2!=0 && nums[end]%2==0){
                      int temp = nums[st];
                      nums[st] = nums[end];
                      nums[end]= temp;
               st++;end--;
            }
            else if(nums[st]%2==0 && nums[end]%2==0){
               st++;
            }
            else if(nums[st]%2!=0 && nums[end]%2!=0){
               end--;
            }
            else{
                st++;end--;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n = sc.nextInt();
    int [] arr = new int [n];
    System.out.println("enter your array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    int [] ans = new int [n];
    System.out.println(" your array:");
    ans=sortArrayByParity(arr);
    for(int i=0;i<n;i++){
        System.out.println(ans[i]);
    }

}

}

