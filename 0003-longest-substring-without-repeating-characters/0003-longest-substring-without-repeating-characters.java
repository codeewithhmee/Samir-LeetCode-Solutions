class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int ans=0;
        // int l=0;
        // HashSet<Character> set=new HashSet<>();
        // for(int r=0;r<s.length();r++){
        //     while(set.contains(s.charAt(r))){
        //         set.remove(s.charAt(l));
        //         l++;
        //     }
        //     set.add(s.charAt(r));
        //     ans=Math.max(ans,r-l+1);
        // }
        // return ans;
        int ans=0;
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
          map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            while(map.get(s.charAt(r))>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;

    }
     
    
}