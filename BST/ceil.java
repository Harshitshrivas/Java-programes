public class ceil {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int ceil(Node root , int key){
         
        int ceilvalue = -1;

        while(root != null){

            if(root.data == key){
                return root.data;
            }
            else if(key > root.data){
                root = root.right;
            }else{
               ceilvalue = root.data;
                root = root.left;
            }
        }
        return ceilvalue;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(20);

        int key = 13;

        int result = ceil(root, key);

        System.out.println("The Ceil of " + key + " = " + result);
    }
}
