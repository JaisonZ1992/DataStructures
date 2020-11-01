package linkedlist;

public class LinkedList {

    private static class Node {
        int data;
        Node nextNode;

        Node(int item){
            this.data = item;
            this.nextNode = null;
        }

    }

    private Node head;

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            return;
        }
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = node;
    }


    public void insertNth(int data, int position) {
        if(position < 1){
            System.out.println("Invalid position");
            return;
        }

        Node node = new Node(data);

        if (isEmpty()) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            node.nextNode = this.head;
            this.head = node;
            return;
        }

        Node previousNode = getPreviousNode(position - 1);
        if(previousNode == null){
            System.out.println("Invalid position");
            return;
        }
        node.nextNode = previousNode.nextNode;
        previousNode.nextNode = node;
    }

    public void removeNth(int position){
        if(isEmpty() || position < 1){
            System.out.println("Invalid position");
        }else{
            if(position == 1){
                Node tempNode = this.head;
                this.head = this.head.nextNode;
                tempNode.nextNode = null;
            }else{

                Node previousNode = getPreviousNode(position-1);
                if(previousNode == null){
                    System.out.println("Invalid position");
                    return;
                }

                Node deletedNode = previousNode.nextNode;
                if(deletedNode == null){
                    System.out.println("Invalid position");
                    return;
                }
                previousNode.nextNode = deletedNode.nextNode;
                deletedNode.nextNode = null;
            }
        }

    }

    public void print() {
        if (this.head == null) {
            return;
        }
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }

    private boolean isEmpty(){
        return this.head == null;
    }

    private Node getPreviousNode(int position){
        Node currentNode = this.head;
        while(currentNode != null){
            if(position == 1){
                return currentNode;
            }
            currentNode = currentNode.nextNode;
            position--;
        }
        return null;
    }

}


