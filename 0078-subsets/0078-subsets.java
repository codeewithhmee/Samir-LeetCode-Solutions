class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(ans,temp,nums,0);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] nums,int idx){
        if(idx==nums.length){
            List<Integer> a=new ArrayList<>(temp);
            ans.add(a);
            return;
        }
        temp.add(nums[idx]);
        helper(ans,temp,nums,idx+1);
        temp.remove(temp.size()-1);
        helper(ans,temp,nums,idx+1);                                                                             
    }
}