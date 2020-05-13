package LinkedLists;

public class PartitionatData {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    public static void partition(Node head, int k){
        //10 - 14 - 18 - 20 - 11 - 9 - 3
        Node lowerHead = null, lowerTail = null;
        Node greaterHead = null, greaterTail = null;

        Node current = head;

        while (current != null)
        {
            if (current.data < k)
            {
                if (lowerHead == null) lowerHead = current;
                if (lowerTail == null) lowerTail = current;
                else lowerTail = lowerTail.next = current;
            }
            else
            {
                if (greaterHead == null) greaterHead = current;
                if (greaterTail == null) greaterTail = current;
                else greaterTail = greaterTail.next = current;
            }

            current = current.next;
        }

        if (greaterHead != null)
            greaterTail.next = null;

        if (lowerHead == null)
            while(greaterHead != null){
                System.out.print(greaterHead.data + "->");
                greaterHead = greaterHead.next;
            }
        else
        {
            lowerTail.next = greaterHead;
            while (lowerHead != null){
                System.out.print(lowerHead.data + "->");
                lowerHead = lowerHead.next;
            }
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       Node newnode = new Node(10);
       newnode.next = new Node(14);
       newnode.next.next = new Node(18);
       newnode.next.next.next = new Node(20);
       newnode.next.next.next.next = new Node(11);
       newnode.next.next.next.next.next = new Node(9);
       newnode.next.next.next.next.next.next = new Node(3);
       int k = 11;
       partition(newnode, k);
    }
}
