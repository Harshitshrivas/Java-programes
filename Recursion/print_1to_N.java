public class print_1to_N {
    static void printName(int n){
    if(n == 0){
        return;
    }
    printName(n-1); // first we will call the function for n-1 and then print the name, this way we will get the output in increasing order from 1 to n
    System.out.println("Harshit Shrivas");
   
}
    public static void main(String[] args) {
        int n = 5;
        printName(n);

    }
}
