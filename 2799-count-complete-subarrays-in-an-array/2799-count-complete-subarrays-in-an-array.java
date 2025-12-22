class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int ans=0;
        for(int n:nums){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map2=new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map2.put(nums[j],map2.getOrDefault(nums[j],0)+1);
                if(map1.size()==map2.size())ans++;
            }
        }
        return ans;
    }
}