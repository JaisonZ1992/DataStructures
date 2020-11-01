import arraylist.ArrayList;
import linkedlist.LinkedList;
import stack.StackWithArray;
import stack.StackWithLinkedList;

public class Main {

    public static void main(String[] args) {
        executeArrayListOperations();
        //executeLinkedList();
        //stackWithArrayOperations();
        //stackWithLinkedListOperations();
    }

    private static void executeArrayListOperations() {
        ArrayList list = new ArrayList(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print();

        list.add(50, 1);
        list.add(60, 3);
        list.print();

        list.add(70, 4);

        list.remove(1);
        list.print();
        list.remove(2);
        list.print();
        list.remove(2);
    }

    private static void stackWithLinkedListOperations() {
        StackWithLinkedList list = new StackWithLinkedList();
        list.print();
        list.push(10);
        list.push(20);
        list.push(30);
        list.print();

        int item = list.peek();
        System.out.println("Top item:" + item);

        item = list.pop();
        System.out.println("Popped:" + item);
        item = list.pop();
        System.out.println("Popped:" + item);
        item = list.pop();
        System.out.println("Popped:" + item);

        list.pop();
    }

    private static void stackWithArrayOperations() {
        StackWithArray array = new StackWithArray(3);
        array.print();
        array.push(10);
        array.push(20);
        array.push(30);
        array.print();

        int item = array.peek();
        System.out.println("Top item:" + item);

        array.push(40);

        item = array.pop();
        System.out.println("Popped:" + item);
        item = array.pop();
        System.out.println("Popped:" + item);
        item = array.pop();
        System.out.println("Popped:" + item);

        array.pop();
    }

    private static void executeLinkedList() {
        LinkedList ls = new LinkedList();
        ls.addLast(10);
        ls.addLast(20);
        ls.addLast(30);
        ls.print();
        ls.insertNth(40, 1);//insert 40 before 10
        ls.removeNth(2);// Remove 10
        ls.print();
    }
}