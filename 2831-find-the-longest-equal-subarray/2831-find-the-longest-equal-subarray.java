class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int l=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int freq=0;
        for(int r=0;r<nums.size();r++){
            map.put(nums.get(r),map.getOrDefault(nums.get(r),0)+1);
            freq=Math.max(freq,map.get(nums.get(r)));
            while(r-l+1 - freq >k){
                map.put(nums.get(l),map.getOrDefault(nums.get(l),0)-1);
                l++;
            }
            ans=Math.max(ans,freq);
        }
        return ans;
    }
}