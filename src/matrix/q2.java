package matrix;

public class q2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int columns = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][columns - 1] >= target) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == target)
                        return true;
                }
            }
        }

        return false;
    }

}
