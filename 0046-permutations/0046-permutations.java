class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       helper(ans,0,nums);
       return ans;
    }
 
    public void helper(List<List<Integer>> ans,int idx,int[] arr){
        //base case
        if(idx==arr.length){
           List<Integer> perm = new ArrayList<>();
            for (int x : arr) perm.add(x);
            ans.add(perm);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            //swapping arr[idx] with arr[i]
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;

            helper(ans,idx+1,arr);
            //back track
            temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;


        }
    }
}