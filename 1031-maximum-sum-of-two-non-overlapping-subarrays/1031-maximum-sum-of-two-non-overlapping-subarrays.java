class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        //for first length
        int l = 0;
        int sum = 0;
        int ans = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if (r - l + 1 < firstLen)
                continue;
            int max = findMax(nums, l, r, secondLen);
            ans = Math.max(ans, sum + max);
            //
            sum -= nums[l];
            l++;

        }
        return ans;
    }

    public int findMax(int[] nums, int s, int e, int secondLen) {
        //from 0 to l-1
        int max = 0;
        int sum = 0;
        int l = 0;
        for (int r = 0; r < s; r++) {
            sum += nums[r];
            if (r - l + 1 < secondLen)
                continue;

            max = Math.max(sum, max);

            sum -= nums[l];
            l++;
        }
        //form r+1 to n
        int max1 = 0;
        int sum1 = 0;
        int l1 = e + 1;
        for (int r = e + 1; r < nums.length; r++) {
            sum1 += nums[r];
            if (r - l1 + 1 < secondLen)
                continue;

            max1 = Math.max(sum1, max1);

            sum1 -= nums[l1];
            l1++;
        }
        return Math.max(max, max1);
    }
}