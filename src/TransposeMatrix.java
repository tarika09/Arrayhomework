public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

   public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
       int columns = matrix[0].length;

       int[][] transposedMatrix = new int[columns][rows];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                transposedMatrix[j][i] = matrix[i][j];
                j++;
            }
            i++;
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


