class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
        max=Math.max(max,n);
       } 
       int l=0;
       long ans=0;
       for(int r=0;r<nums.length;r++){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        while(map.containsKey(max) && map.get(max)>=k){
           ans += (long)(nums.length - r);
            map.put(nums[l],map.getOrDefault(nums[l],0)-1);
            l++;
        }
       }
       return ans;
    }
}