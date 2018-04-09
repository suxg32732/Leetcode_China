public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null || nums.length * nums[0].length != r * c)
            return nums;

        int rows = nums.length;
        int clos = nums[0].length;

        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int rowIndex = (i * c + j) / clos;
                int cloIndex = (i * c + j) % rows;
                res[i][j] = nums[rowIndex][cloIndex];
            }
        }
        return res;
    }
}
