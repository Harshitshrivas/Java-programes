public class stackarr {

    static final int MAX = 5;
    static int[] stack = new int[MAX];
    static int top = -1;

    static void push(int value) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow..");
        } else {
            top++;
            stack[top] = value;
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Empty..");
        } else {
            System.out.println("Deleted: " + stack[top]);
            top--;
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack Empty..");
        } else {
            System.out.println("Top: " + stack[top]);
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static int size() {
        return top + 1;
    }

    static boolean isFull() {
        return top == MAX - 1;
    }

    static void displayyy() {
        if (top == -1) {
            System.out.println("Stack Empty..");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        displayyy();
        pop();
        displayyy();
        peek();
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Size: " + size());
        System.out.println("Is Full: " + isFull());
        pop();
        displayyy();

    }
}
