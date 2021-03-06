package stack;

public class StackWithArray {
    private int top = -1;
    private final int[] stack;

    public StackWithArray(int length) {
        this.stack = new int[length];
    }

    public void push(int item) {
        if (isStackFull()) {
            System.out.println("Stack overflow");//Can throw errors
            return;
        }
        this.top++;
        this.stack[this.top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");//Can throw errors
            return -1;
        } else {
            return this.stack[this.top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty");//Can throw errors
            return -1;
        }
        return this.stack[top];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(this.stack[i]);
        }
        System.out.println("***********");
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isStackFull() {
        return this.top == this.stack.length - 1;
    }
}
