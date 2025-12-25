class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
       for(int n:nums){
        max=Math.max(max,n);
       } 
       int l=0;
       long ans=0;
       int c=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==max)c++;
        while(c>=k){
           ans += (long)(nums.length - r);
            if(nums[l]==max)c--;
            l++;
        }
       }
       return ans;
    }
}