import java.util.Arrays;

public class Transposition {
    public static void main(String[] args) {
        int [][] numbs = {
                          {8, 0, 8},
                          {3, 2, 5},
                          {4, 9, 1} };
            int[][] result = new int[numbs[0].length][numbs.length];
            for (int i = 0; i < numbs.length; i++) {
                for (int j = 0; j < numbs[0].length; j++) {
                    result[j][i] = numbs[i][j];
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
        }
    }
}