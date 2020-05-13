package LinkedLists;
import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    public static void removeDuplicates(Node head){
        Set<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while(current != null){
            if(!set.contains(current.data)){
                set.add(current.data);
                previous = current;
            }
            else{
                previous.next = current.next;
            }

            current = current.next;
        }
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node newnode = new Node(10);
        newnode.next = new Node(12);
        newnode.next.next = new Node(11);
        newnode.next.next.next = new Node(11);
        newnode.next.next.next.next = new Node(12);
        newnode.next.next.next.next.next = new Node(11);
        newnode.next.next.next.next.next.next = new Node(10);
        removeDuplicates(newnode);
    }
}
