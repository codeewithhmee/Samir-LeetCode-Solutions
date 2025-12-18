class Solution {
    public int longestOnes(int[] nums, int k) {
       int ans=0;
       int l=0;
       int[] freq=new int[2];
       for(int r=0;r<nums.length;r++){
        freq[nums[r]]++;
        while(freq[0]>k){
            freq[nums[l]]--;
            l++;
        }
        ans=Math.max(ans,r-l+1);
       }
       return ans;
    }
}