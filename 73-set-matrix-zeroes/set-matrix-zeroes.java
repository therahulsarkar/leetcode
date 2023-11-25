class Solution {
    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int[] row = new int[rowSize]; 
        int[] col = new int[colSize]; 

        for(int i =0; i<rowSize; i++){
            for(int j =0; j<colSize; j++){
                if(matrix[i][j] == 0){
                    row[i] = Integer.MIN_VALUE;
                    col[j] = Integer.MIN_VALUE;
                }
                    }
        }

        for(int i =0; i<rowSize; i++){
            for(int j =0; j<colSize; j++){
                if(row[i] ==Integer.MIN_VALUE || col[j] == Integer.MIN_VALUE ){
                    matrix[i][j] = 0;
                }
                    }
        }

    }
}