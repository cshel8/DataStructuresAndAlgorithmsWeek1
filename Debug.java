public class Debug {
    public static void main(String[] args) {
        int a = 3;
        int b = 11;
        System.out.println(mystery(a, b));
    }
    public static int mystery(int a, int b) {
        if(b == 0) return 1;
        if(b % 2 == 0) return mystery(a * a, b / 2);
        return  mystery (a * a, b / 2) * a;
    }
}
