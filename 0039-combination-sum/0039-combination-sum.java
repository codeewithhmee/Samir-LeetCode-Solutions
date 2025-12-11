class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates,target,0,ans,temp);
        return ans;
    }
    public void helper(int[] arr,int target,int idx,List<List<Integer>> ans,List<Integer> temp){
        //base case
        if(target<=0 || idx==arr.length){
            if(target==0){
                List<Integer> a=new ArrayList<>(temp);
                ans.add(a);
            }
            return;
        }

        //include element
        temp.add(arr[idx]);
        helper(arr,target-arr[idx],idx,ans,temp);


        //exclude element
        temp.remove(temp.size()-1);
        helper(arr,target,idx+1,ans,temp);


    }
}