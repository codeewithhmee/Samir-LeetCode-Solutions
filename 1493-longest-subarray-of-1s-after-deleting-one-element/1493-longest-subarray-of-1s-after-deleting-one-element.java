class Solution {
    public int longestSubarray(int[] nums) {
        int f=0;
        int l=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)f++;
            while(f>1){
                if(nums[l]==0){
                    f--;
                }
                l++;
            }
            //valid window
            
                ans=Math.max(ans,r-l);
           
        }
        return ans;
    }
}