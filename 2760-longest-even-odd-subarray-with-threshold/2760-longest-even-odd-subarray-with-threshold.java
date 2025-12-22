class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
    int ans=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0)continue;
        List<Integer> temp=new ArrayList<>();
        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            if(isValid(temp,threshold)){
                ans=Math.max(ans,temp.size());
            }
        }
     }
     return ans;
    }
    public boolean isValid(List<Integer> temp,int threshold){
        for(int i=0;i<temp.size();i++){
            if(i%2==0 && temp.get(i)%2==1)return false;
            if(i%2==1 && temp.get(i)%2==0)return false;
            if(temp.get(i)>threshold)return false;
        }
        return true;
    }

  

}