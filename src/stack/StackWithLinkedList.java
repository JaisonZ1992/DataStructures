package stack;

public class StackWithLinkedList {

    private static class Node {
        int data;
        Node nextNode;

        Node(int item) {
            this.data = item;
            this.nextNode = null;
        }
    }

    private Node top;

    public StackWithLinkedList() {
    }

    public void push(int item) {
        Node node = new Node(item);
        if (node == null) {
            System.out.println("Stack overflow");//Throw exception
            System.out.println("***********");
            return;
        }

        if (isEmpty()) {
            top = node;
        } else {
            node.nextNode = top;
            top = node;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            System.out.println("***********");
            return -1;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");//Throw exception
            System.out.println("***********");
            return -1;
        }
        //Should always unlink a node when removing from a linked list
        Node tempNode = top;
        top = top.nextNode;
        tempNode.nextNode = null;
        return tempNode.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            System.out.println("***********");
            return;
        }
        Node tempNode = top;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
        System.out.println("***********");
    }

    private boolean isEmpty() {
        return top == null;
    }
}
