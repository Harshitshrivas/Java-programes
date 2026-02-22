public class name {
    static void printname(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Harshit");
        printname(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printname(n);
    }
}
