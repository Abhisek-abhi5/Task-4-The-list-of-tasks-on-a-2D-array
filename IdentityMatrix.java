public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] array = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && array[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) break;
        }

        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}
