public class RowColumnSum {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = array.length;
        int cols = array[0].length;

        // Row-wise sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Column-wise sum
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }
}
