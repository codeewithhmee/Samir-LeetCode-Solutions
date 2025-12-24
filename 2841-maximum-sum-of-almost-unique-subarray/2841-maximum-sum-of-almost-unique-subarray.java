class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        long ans = 0;
        long sum = 0;
        for (int r = 0; r < nums.size(); r++) {
            map.put(nums.get(r), map.getOrDefault(nums.get(r), 0) + 1);
            sum += nums.get(r);
            if (r - l + 1 < k)
                continue;

            if ( map.size()>=m) {
                ans = Math.max(ans, sum);
            }
            map.put(nums.get(l), map.getOrDefault(nums.get(l), 0) - 1);
            if (map.get(nums.get(l)) == 0)
                map.remove(nums.get(l));
            sum -= nums.get(l);
            l++;

        }
        return ans;
    }
}