class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=-999999;
        int sum=0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            //work
            sum=sum+nums[r];
            int windowSize=r-l+1;
            if(windowSize<k)continue;
            //aba valid window
            ans=Math.max(sum,ans);
            //work
            sum=sum-nums[l];
            l++;
        }
        return ans/k;
    }
}