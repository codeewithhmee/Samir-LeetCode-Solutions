class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates,ans,temp,0,target);
        return ans;

    }
    public void helper(int[] arr,List<List<Integer>> ans,List<Integer> temp,int idx,int target){
        //base case
        if(idx>=arr.length || target<=0){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        //dont move forward or put the same element in ds
        temp.add(arr[idx]);
        helper(arr,ans,temp,idx,target-arr[idx]);
        //move forward
        temp.remove(temp.size()-1);
        helper(arr,ans,temp,idx+1,target);
    }
   
      
}