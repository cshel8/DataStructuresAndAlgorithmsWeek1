public class TwoDimensionalBoolean {
    public static void main(String[] args) {
    boolean myMatrix[][] = { {true, true, true},
                             {false, true, false},
                             {true, false, true} };
        System.out.print("Column: ");
        for (int column = 0; column < myMatrix[0].length; column++) {
            System.out.print(column + " ");
        }
        System.out.println();
        for (int i = 0; i < myMatrix.length; i++) {
            System.out.print("Row " + i + ":  ");
            for (int j = 0; j < myMatrix[i].length; j++) {
                if(myMatrix[i][j]){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}