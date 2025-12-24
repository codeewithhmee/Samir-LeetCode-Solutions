class Solution {

    public String longestNiceSubstring(String s) {
        int ans=0;
        String f="";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i;j<c.length;j++){
                String str=s.substring(i,j+1);
                if(valid(str)){
                    if(str.length()>ans){
                        ans=str.length();
                        f=str;
                    }
                }
            }
        }
        return f;
    }
    public boolean valid(String s){
    HashSet<Character> set = new HashSet<>();
    for(char ch : s.toCharArray()) set.add(ch);

    for(char ch : s.toCharArray()){
        if(Character.isLowerCase(ch) && !set.contains(Character.toUpperCase(ch))) return false;
        if(Character.isUpperCase(ch) && !set.contains(Character.toLowerCase(ch))) return false;
    }
    return true;
}
}