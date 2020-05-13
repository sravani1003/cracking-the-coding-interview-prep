package LinkedLists;

public class DetectCycle {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }

    public static Node detectCycle(Node head){
        Node first = head;
        Node second = head;

        while (second != null || second.next != null) {
            first = first.next;
            second = second.next.next;
            if(first == second){
                break;
            }
        }

        if(second == null || second.next == null){
            return null;
        }

        first = head;
        while(first != second){
            first = first.next;
            second = second.next;
        }

        return second;
    }

    public static void main(String[] args) {
        Node newnode = new Node('A');
        newnode.next = new Node('B');
        newnode.next.next = new Node('C');
        newnode.next.next.next = new Node('D');
        newnode.next.next.next.next = new Node('C');

        System.out.println(detectCycle(newnode));
    }
}
