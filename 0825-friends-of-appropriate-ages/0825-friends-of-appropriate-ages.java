class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length;
        int res = 0;
        int left = 0, right = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] < 15) continue; 

            while (left < n && ages[left] <= 0.5 * ages[i] + 7) left++;
            while (right + 1 < n && ages[right + 1] <= ages[i]) right++;
            System.out.println("i:"+i+",right:"+right);

           res += (right - left);
        }

        return res;
    }
}
