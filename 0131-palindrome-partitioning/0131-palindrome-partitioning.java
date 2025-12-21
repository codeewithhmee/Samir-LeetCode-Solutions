class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(ans,temp,0,s);
        return ans;

    }
    public void helper(List<List<String>> ans,List<String> temp,int idx,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String sub=s.substring(idx,i+1);
            if(isPalin(sub)){
                temp.add(sub);
                helper(ans,temp,i+1,s);
                temp.remove(temp.size()-1);
            }

        }
    }
    public boolean isPalin(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
}