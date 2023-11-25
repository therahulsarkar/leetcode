/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */


var setZeroes = function (matrix) {
    let row = matrix.length;
    let col = matrix[0].length;

    if (row === 0 || col === 0) {
        return matrix;
    }

    function markRow(i) {
        for (let j = 0; j < col; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = Number.MIN_SAFE_INTEGER;
            }
        }
    }

    function markCol(j) {
        for (let i = 0; i < row; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = Number.MIN_SAFE_INTEGER;
            }
        }
    }

    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            if (matrix[i][j] === 0) {
                markRow(i);
                markCol(j);
            }
        }
    }

    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            if (matrix[i][j] === Number.MIN_SAFE_INTEGER) {
                matrix[i][j] = 0;
            }
        }
    }

    return matrix;
};
