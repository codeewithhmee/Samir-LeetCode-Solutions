class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int n:nums){
            sum+=n;
            while(n!=0){
                digit+=n%10;
                n=n/10;
            }
        }
        return sum-digit;
       
    }
}