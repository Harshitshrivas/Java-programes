public class name {
    static void printname(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Harshit"); // first we will print the name and then call the function for n-1, this way we will get the output in decreasing order from n to 1
        printname(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printname(n);
    }
}
