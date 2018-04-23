public class Solution {
    public void moveZeroes(int[] nums) {

        if (nums == null) return;

        int end = nums.length - 1;
        int begin = 0;
        for (; begin < end;) {
            if (nums[begin] == 0) {
                int temp = nums[begin];
                nums[begin] = nums[end];
                nums[end--] = temp;
            }
            else
                begin++;
        }
    }
}
