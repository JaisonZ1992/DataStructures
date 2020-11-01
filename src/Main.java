
public class Main {

    public static void main(String[] args) {
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