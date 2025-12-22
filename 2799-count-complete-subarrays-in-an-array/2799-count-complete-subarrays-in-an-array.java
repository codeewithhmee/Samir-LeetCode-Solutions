class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int ans=0;
        for(int n:nums){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        int size=map1.size();

        return atMost(nums,size)-atMost(nums,size-1);
    }
    public int atMost(int[] nums,int k){
        int l=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++){
              map.put(nums[r],map.getOrDefault(nums[r],0)+1);
              while(l<=r && map.size()>k){
                 map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                 if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                 }
                 l++;
              }
              ans=ans+r-l+1;
        }
        return ans;
    }
}