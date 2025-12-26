class Solution {
    public int compress(char[] chars) {
        int p1 = 0;
        int p2 = 1;
        int write=0;
        for (p2 = 1; p2 <=chars.length; p2++) {
            if (p2==chars.length || chars[p2] != chars[p1]) {
                 chars[write++] = chars[p1];
                 int f=p2-p1;
                  if (f > 1) {
                    String freq = String.valueOf(f);
                    for (int i = 0; i < freq.length(); i++) {
                        chars[write++] = freq.charAt(i);
                    }
                }
                p1=p2;
            }
            
        }
        return write;
    }
}