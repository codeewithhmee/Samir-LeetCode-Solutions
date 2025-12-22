class Solution {
    public char findKthBit(int n, int k) {
        //lets make a brute force
        String s=helper(n);
        return s.charAt(k-1);

    }
    public String helper(int n){
        if(n==0)return "0";
        String d=helper(n-1);
        return d+"1"+reverse(invert(d));

    }
  public String reverse(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
        sb.append(s.charAt(i));
    }
    return sb.toString();
}
    public String invert(String s) {
    StringBuilder sb = new StringBuilder(s.length());
    for (int i = 0; i < s.length(); i++) {
        sb.append(s.charAt(i) == '1' ? '0' : '1');
    }
    return sb.toString();
}

}