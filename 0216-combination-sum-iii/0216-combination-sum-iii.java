class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[n>=9?9:n];
        for(int i=0;i<arr.length;i++)arr[i]=i+1;

       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
       helper(arr,0,temp,ans,n,k);
       return ans; 
    }
    public void helper(int[] arr,int idx,List<Integer> temp,List<List<Integer>> ans,int target,int length){
        if(idx>=arr.length || target<=0 || temp.size()>=length){
        if(target==0 && temp.size() == length){
            ans.add(new ArrayList<>(temp));
        }
        return;

        }
        //add element
        temp.add(arr[idx]);
        helper(arr,idx+1,temp,ans,target-arr[idx],length);
        //remove
        temp.remove(temp.size()-1);
        helper(arr,idx+1,temp,ans,target,length);


    }
}