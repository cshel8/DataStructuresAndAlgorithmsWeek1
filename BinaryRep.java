import java.util.Scanner;
public class BinaryRep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you would like to convert to binary");
        int N = input.nextInt();
        String s = toBinary(N);
        System.out.println(s);
    }
    public static String toBinary(int N) {
        if (N == 0) {
            return "";
        }
        return toBinary(N / 2) + (N % 2);
    }
}