class Solution {
    public int[] searchRange(int[] nums, int target) {
      //this is pure upper bound and lower bound question
      return new int[]{startingIndex(nums,target),lastIndex( nums, target)};
    }
    public static int startingIndex(int[] nums,int target){
        //lower bound
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                if(nums[m]==target)ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
     public static int lastIndex(int[] nums,int target){
        //upper bound
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<=target){
                if(nums[m]==target)ans=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
 
    
}