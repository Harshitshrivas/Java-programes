import java.util.ArrayList;

public class stackarrlist {

    static ArrayList<Integer> stack = new ArrayList<>();

    static void push(int value) {
        stack.add(value);
    }

    static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty...");
        } else {
            int lastidx = stack.size() - 1;
            System.out.println("Deleted: " + stack.get(lastidx));
            stack.remove(lastidx);

        }
    }

    static void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty...");
        } else {
            System.out.println("TOP: " + stack.get(stack.size() - 1));
        }
    }

    static boolean  isEmptyy(){
        return stack.isEmpty();
    }

    static int sizee() {
        return stack.size();
    }

    static void display() {
        System.out.print("Stack elements: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
        peek();
        pop();
        display();
        System.out.println("Size of Stack is: " + sizee());
        System.out.println("Is Full: " +  isEmptyy());

    }
}
