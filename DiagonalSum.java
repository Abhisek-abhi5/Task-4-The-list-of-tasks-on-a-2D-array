public class DiagonalSum {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            mainDiagonalSum += array[i][i];
            secondaryDiagonalSum += array[i][array.length - 1 - i];
        }

        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }
}
