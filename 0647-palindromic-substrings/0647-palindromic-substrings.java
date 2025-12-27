class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        //for odd and even length
        for (int i = 0; i < s.length(); i++) {
            //for odd length
            ans += odd(s, i);
            //for evern length
            ans+=even(s,i);
        }
        return ans;

    }

    public int odd(String s, int i) {
        int l = i;
        int r = i;
        int ans = 0;
        while (l >= 0 && r < s.length() && s.charAt(l--) == s.charAt(r++)) {
            ans++;
        }
        return ans;
    }

    public int even(String s, int i) {
        int l = i;
        int r = i + 1;
        int ans = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            ans++;
            l--;
            r++;
        }
        return ans;
    }
}