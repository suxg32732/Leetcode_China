public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null || nums.length * nums[0].length != r * c)
            return nums;

        int rows = nums.length;
        int clos = nums[0].length;

        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int cloIndex = (i * c + j) % clos;
                int rowIndex = (i * c + j) / clos ;
                res[i][j] = nums[rowIndex][cloIndex];
            }
        }
        return res;
    }

    int[][] Reshape(int[][] nums, int r, int c) {

        if (nums == null || nums.length * nums[0].length != r * c)
            return nums;

        int rows = nums.length;
        int clos = nums[0].length;

        int i = 0, j = 0;
        int[][] res = new int[r][c];
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < clos; l++) {
                res[i][j++] = nums[k][l];
                if (j % c == 0) {
                    j = 0;
                    i++;
                }
            }
        }
        return res;
    }
}
