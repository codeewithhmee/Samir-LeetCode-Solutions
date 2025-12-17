class Solution {
    int count=0;
    public int beautifulSubsets(int[] nums, int k) {
        helper(nums,k,0,new ArrayList<>());
        return count-1;
    }
    public void helper(int[] nums,int k,int idx,List<Integer> temp){
        if(idx==nums.length){
            if(check(temp,k)){
                count++;
            }
            return;
        }
        //include
        temp.add(nums[idx]);
        helper(nums,k,idx+1,temp);
        //backtrack
        temp.remove(temp.size()-1);
        //exclude
        helper(nums,k,idx+1,temp);


    }
    public boolean check(List<Integer> nums,int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            int t1=nums.get(i)-k;
            int t2=k+nums.get(i);
            if(set.contains(t1) || set.contains(t2))return false;
            set.add(nums.get(i));
        }
        return true;
    }
}