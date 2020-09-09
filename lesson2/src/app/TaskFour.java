package app;

public class TaskFour {

    public int[][] initMatrixArr(int grid, int strip) {
        int[][] matrixArr = new int[grid][grid];
        for (int i = 0, j = grid - 1; i < grid; i++, j--) {
            matrixArr[i][i] = strip;
            matrixArr[i][j] = strip;
        };
        return matrixArr;
    }
}
