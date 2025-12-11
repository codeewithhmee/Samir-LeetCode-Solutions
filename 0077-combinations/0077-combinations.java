class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>  ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(n,1,temp,ans,k);
        return ans;
        
    }
    public void helper(int n,int count,List<Integer> temp,List<List<Integer>> ans,int k){
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
           if (count > n) {
            return;
        }
     
        //include element
        temp.add(count);
        helper(n,count+1,temp,ans,k);
        //remove element
        temp.remove(temp.size()-1);
        helper(n,count+1,temp,ans,k);
    }
}