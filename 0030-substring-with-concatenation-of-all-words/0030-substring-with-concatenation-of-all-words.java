class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n=words.length;
        int k=words[0].length();
        int l=s.length();

        HashMap<String,Integer> map=new HashMap<>();
        for(String ss:words)map.put(ss,map.getOrDefault(ss,0)+1);

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<=l-n*k;i++){
            HashMap<String,Integer> map1=new HashMap<>();
            for(int j=i;j<i+n*k;j=j+k){
                String s1=s.substring(j,j+k);
                map1.put(s1,map1.getOrDefault(s1,0)+1);
            }
            if(same(map1,map))ans.add(i);
        }
        return ans;
    }
    public boolean same(HashMap<String,Integer> map1, HashMap<String,Integer> map2) {
    if (map1.size() != map2.size()) return false;

    for (String key : map1.keySet()) {
        if (!map2.containsKey(key)) return false;        // key missing
        if (!map1.get(key).equals(map2.get(key))) return false; // value mismatch
    }

    return true;
}

}