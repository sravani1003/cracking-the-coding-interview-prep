package LinkedLists;

public class DeleteMiddle {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    public static void deleteMiddle(Node head){
        Node singlePoint = head;
        Node doublePoint = head;
        Node previous = null;
        while(doublePoint != null && doublePoint.next != null){
            doublePoint = doublePoint.next.next;
            previous = singlePoint;
            singlePoint = singlePoint.next;
        }
        previous.next = singlePoint.next;
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node newnode = new Node(1);
        newnode.next = new Node(2);
        newnode.next.next = new Node(3);
        newnode.next.next.next = new Node(4);
        newnode.next.next.next.next = new Node(5);
        newnode.next.next.next.next.next = new Node(6);
        newnode.next.next.next.next.next.next = new Node(7);
        deleteMiddle(newnode);
    }
}
