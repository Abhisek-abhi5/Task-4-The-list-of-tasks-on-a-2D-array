public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
