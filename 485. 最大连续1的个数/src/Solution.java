class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = 0;
        int begin = 0;
        boolean zero_exist = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                max = Math.max(max, i - begin);
                begin = i + 1;
                zero_exist = true;
            }
        }
        if (zero_exist)
            return max;
        else
            return nums.length;
    }
}
