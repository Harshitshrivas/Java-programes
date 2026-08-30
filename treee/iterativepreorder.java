import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativepreorder {

     public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static List<Integer> preorder(Node root) {

        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<Node> st= new Stack<>();

        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            ans.add(root.data);  // Add the current node's data to the result list
            if(root.right != null) st.push(root.right);  // Push the right child first so that the left child is processed first
            if(root.left != null) st.push(root.left); // Push the left child onto the stack
        }
        return ans;
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        List<Integer> result = preorder(root);
        System.out.println(result);
    }
}
