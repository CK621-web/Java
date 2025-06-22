package lesson22;

public class ActivityRingRotate {
    public static void rotateOuterRing(int[][] matrix) {
        int n = matrix.length;
        if (n == 0)
            return;

        int prev = matrix[0][0];

        for (int j = 1; j < n; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = prev;
            prev = temp;
        }

        for (int i = 1; i < n; i++) {
            int temp = matrix[i][n - 1];
            matrix[i][n - 1] = prev;
            prev = temp;
        }

        for (int j = n - 2; j >= 0; j--) {
            int temp = matrix[n - 1][j];
            matrix[n - 1][j] = prev;
            prev = temp;

        }

        for (int i = n - 2; i >= 0; i--) {
            int temp = matrix[i][0];
            matrix[i][0] = prev;
            prev = temp;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.println(val + "\t");
            }

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

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateOuterRing(matrix);

        System.out.println("Matrix after rotating outer ring by 1 step clockwise:");
        printMatrix(matrix);
    }

}