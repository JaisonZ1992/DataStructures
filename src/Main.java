
public class Main {

    public static void main(String[] args) {
       // executeLinkedList();
        executeStackOperations();
    }

    private static void executeStackOperations() {
        StackWithArray array = new StackWithArray(3);
        array.print();
        array.push(10);
        array.push(20);
        array.push(30);
        array.print();

        int item =  array.peek();
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
        ls.insertNth(40,1);
        ls.removeNth(2);
        ls.print();
    }
}