class Solution {
    public int longestMountain(int[] arr) {
        int up = 0, down = 0, ans = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] || (down > 0 && arr[i] > arr[i - 1])) {
                up = down = 0;
            }

            if (arr[i] > arr[i - 1]) {
                up++;
            } else if (arr[i] < arr[i - 1]) {
                if (up > 0) down++;
            }

            if (up > 0 && down > 0) {
                ans = Math.max(ans, up + down + 1);
            }
        }
        return ans;
    }
}
