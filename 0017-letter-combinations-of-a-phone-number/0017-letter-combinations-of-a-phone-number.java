class Solution {
     HashMap<Character,String> map=new HashMap<>();
    

    public List<String> letterCombinations(String digits) {
         map.put('2',"abc");
     map.put('3',"def");
     map.put('4',"ghi");
     map.put('5',"jkl");
     map.put('6',"mno");
     map.put('7',"pqrs");
     map.put('8',"tuv");
     map.put('9',"wxyz");
       List<String> ans=new ArrayList<>();
       char[] arr=digits.toCharArray();
       helper(arr,0,ans,new ArrayList<>());
       return ans;
    }
    public void helper(char[] arr,int idx,List<String> ans,List<Character> temp){
        if(idx==arr.length){
            String a="";
            for(int i=0;i<temp.size();i++)a=a+temp.get(i);
            ans.add(a);
            return ;
        }
        char[] letters=map.get(arr[idx]).toCharArray();
        for(int i=0;i<letters.length;i++){
            temp.add(letters[i]);
            helper(arr,idx+1,ans,temp);
            temp.remove(temp.size()-1);
        }

    }
}