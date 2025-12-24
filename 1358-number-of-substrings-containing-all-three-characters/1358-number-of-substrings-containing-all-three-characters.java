class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int ans=0;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){

            char ch=s.charAt(r);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>=3){
                ans=ans+(s.length()-r);
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
        }
        return ans;
    }
}