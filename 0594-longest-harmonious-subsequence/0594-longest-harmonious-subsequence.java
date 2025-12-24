class Solution {
    public int findLHS(int[] nums) {
        //brute force
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(int n:nums){
            int f=0;
            if(map.containsKey(n+1) && map.containsKey(n)){
                f=map.get(n)+map.get(n+1);
            }else if(map.containsKey(n-1) && map.containsKey(n)){
                f=map.get(n)+map.get(n-1);
            }
            ans=Math.max(ans,f);
        }
        return ans;

    }
}