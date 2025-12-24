class Solution {
    public int findLHS(int[] nums) {
        //brute force
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        int f=0;
        for(int n : map.keySet()){
           if(map.containsKey(n+1)){
            f=map.get(n+1)+map.get(n);
           }
           ans=Math.max(ans,f);
        }
        return ans;

    }
}