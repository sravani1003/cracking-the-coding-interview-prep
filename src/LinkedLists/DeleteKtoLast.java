package LinkedLists;

public class DeleteKtoLast {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    public static int kToLast(Node head, int k){
        Node current = head;
        int count = 0;
        int i = 0;
        while(current != null){
            current = current.next;
            count++;
        }
        count = count - k;
        while(i < count){
            head = head.next;
            i++;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node newnode = new Node(1);
        newnode.next = new Node(2);
        newnode.next.next = new Node(3);
        newnode.next.next.next = new Node(4);
        newnode.next.next.next.next = new Node(5);
        newnode.next.next.next.next.next = new Node(6);
        newnode.next.next.next.next.next.next = new Node(7);
        int k = 3;
        System.out.println(kToLast(newnode, k));
    }
}
