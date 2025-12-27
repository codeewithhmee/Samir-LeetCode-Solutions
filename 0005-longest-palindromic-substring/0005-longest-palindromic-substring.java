class Solution {
    public String longestPalindrome(String s) {
        int[] idx = new int[2];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i + 1);
            if (oddLength > evenLength) {
                if (ans < oddLength) {
                    ans = oddLength;
                    idx[0] = i - oddLength / 2;
                    idx[1] = i + oddLength / 2;
                }
            } else {
                if (ans < evenLength) {
                    ans = evenLength;
                    idx[0] = i - (evenLength - 1) / 2;
                    idx[1] = i + evenLength / 2;

                }
            }
        }
        return s.substring(idx[0], idx[1] + 1);

    }

    public int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}