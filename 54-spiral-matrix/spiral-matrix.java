class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        while (top <= bottom && left <= right) {
            // Print Left -> Right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            // Increment the top by 1 because the first row is printed 
            top++;
            // Print Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            // Decrement the right because the last column is printed
            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
