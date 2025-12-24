class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=9999999;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            for(int j=i;j<nums.size();j++){
                sum+=nums.get(j);
                if(j-i+1<l)continue;
                if(j-i+1>r)break;
                if(sum>0){
                    ans=Math.min(ans,sum);
                }
            }
        }
        if(ans==9999999)return -1;
        return ans;
    }
}