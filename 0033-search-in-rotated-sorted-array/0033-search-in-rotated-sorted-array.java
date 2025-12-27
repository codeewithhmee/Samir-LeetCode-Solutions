class Solution {
    public int search(int[] nums, int target) {
      int l=0;
      int r=nums.length-1;
      while(l<=r){
        int m=(l+r)/2;
          if (nums[m] == target) return m;
        
        if(nums[m]<nums[r]){
            //if right side is sorted
            if(target<=nums[r] && target>nums[m]){
                // in that half
                l=m+1;
            }else{
                r=m-1;
            }
        }else{
            //left side is sorted
            if(target<nums[m] && target>=nums[l]){
                r=m-1;
            }else{
                l=m+1;
            }
        }
       
      }
       return -1;
    }
 
   
}