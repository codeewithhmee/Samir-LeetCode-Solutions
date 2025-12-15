class Solution {
    public boolean isAnargam(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(freq1, freq2);

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        int[] check = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (check[i] == 1)
                continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnargam(strs[i], strs[j])) {
                    temp.add(strs[j]);
                    check[j] = 1;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}