class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> temp=new ArrayList<>(); 
       int[] check=new int[nums.length];
       helper(ans,temp,check,nums);
       return ans;
    }
    public void helper(List<List<Integer>> ans,  List<Integer> temp,int[] check,int[] arr){
        if(temp.size()>=arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(check[i]==1)continue;
            temp.add(arr[i]);
            check[i]=1;
            helper(ans,temp,check,arr);
            temp.remove(temp.size()-1);
            check[i]=0;
        }

    }
}