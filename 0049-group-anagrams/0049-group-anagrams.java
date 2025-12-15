class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
     HashMap<String,List<String>> map=new HashMap<>();
     for(String s:strs){
     char[] c = s.toCharArray(); // convert string to char array
Arrays.sort(c); 
        String temp=new String(c);
        if(map.containsKey(temp)){
            map.get(temp).add(s);
        }else{
            List<String> list=new ArrayList<>();
            list.add(s);
            map.put(temp,list);
        }
     }
     for(String key:map.keySet()){
        ans.add(map.get(key));
     }
     return ans;

    }
}