class Solution {
    public boolean canJump(int[] nums) {
        // int max = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (i > max)
        //         return false;
        //     max = Math.max(i + nums[i], max);
        // }
        // return true;
        //next method
        int destination=nums.length-1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if(i+nums[i]>=destination){
                destination=i;
            }
        }
        return destination==0;
    }
}