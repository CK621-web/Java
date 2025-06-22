package lesson22;

public class ActivityRingRotateByNTimes {

    public static void rotateOuterRing(int[][] matrix, int rotateBy) {
        int n = matrix.length;
        if (n == 0)
            return;

        int size = 4 * (n - 1);
        int[] ring = new int[size];
        int idx = 0;

        for (int j = 0; j < n; j++)
            ring[idx++] = matrix[0][j];

        for (int i = 1; i < n; i++)
            ring[idx++] = matrix[i][n - 1];

        for (int j = n - 2; j >= 0; j--)
            ring[idx++] = matrix[n - 1][j];

        for (int i = n - 2; i >= 1; i--)
            ring[idx++] = matrix[i][0];

        int[] rotated = new int[size];
        for (int i = 0; i < size; i++) {
            rotated[(i + rotateBy) % size] = ring[i];
        }

        idx = 0;
        for (int j = 0; j < n; j++)
            matrix[0][j] = rotated[idx++];
        for (int i = 1; i < n; i++)
            matrix[i][n - 1] = rotated[idx++];
        for (int j = n - 2; j >= 0; j--)
            matrix[n - 1][j] = rotated[idx++];
        for (int i = n - 2; i >= 1; i--)
            matrix[i][0] = rotated[idx++];
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int rotateBy = 4;

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateOuterRing(matrix, rotateBy);

        System.out.println("Matrix after rotating outer ring by " + rotateBy + " step(s) clockwise:");
        printMatrix(matrix);
    }
}
