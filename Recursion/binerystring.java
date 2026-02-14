public class binerystring {
    static void generate(int n, String current, int lastbit) {

        if (current.length() == n) {
            System.out.println(current);  // current string ko print karna chahiye, kyunki current string ka length n ke barabar hai, aur current string me 2 consecutive 1 nahi hai, kyunki lastbit 1 hone par hi 1 add karna chahiye
            return;
        }

        generate(n, current + "0", 0); // current string me 0 add karna chahiye, kyunki 0 add karne se 2 consecutive 1 nahi honge, aur lastbit ko 0 set karna chahiye, kyunki current string me 0 add kiya hai

        if (lastbit == 0) {
            generate(n, current + "1", 1); //
        }

    }

    public static void main(String[] args) {
        int n = 4;
        generate(n, "", 0);

    }
}
