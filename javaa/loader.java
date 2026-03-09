public class loader {
    public static void main(String[] args) {

         // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());

        // Test class is loaded by Application loader
        System.out.println(loader.class.getClassLoader());
    }
}
