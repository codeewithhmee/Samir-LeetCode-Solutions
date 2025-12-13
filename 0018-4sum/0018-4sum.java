class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            long t = (long)target - nums[i]; 
            for (int j = i + 1; j < nums.length; j++) {
                long t1 = t - nums[j]; 
                int s = j + 1;
                int e = nums.length - 1;
                while (s < e) {
                    long sum = (long)nums[s] + nums[e]; 
                    if (sum == t1) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[e]);
                        if (!set.contains(temp)) {
                            ans.add(temp);
                            set.add(temp);
                        }
                        s++;
                    } else if (sum > t1) {
                        e--;
                    } else {
                        s++;
                    }
                }
            }
        }
        return ans;
    }
}
