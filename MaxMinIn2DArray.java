public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int max = array[0][0];
        int min = array[0][0];

        for (int[] row : array) {
            for (int element : row) {
                if (element > max) max = element;
                if (element < min) min = element;
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
