package LinkedLists;

public class SumLists {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    public static void sumLists(Node head1, Node head2){
        Node res = null;
        Node prev = null;
        int carry = 0;
        int sum = 0;
        //345 + 467
        while(head1 != null || head2 != null){
            sum += (head1 == null ? 0 : head1.data) + (head2 == null ? 0 : head2.data);
            carry = sum > 10 ? 1 : 0;
            sum = sum % 10;
            Node temp = new Node(sum);
            if(res == null){
                System.out.println(sum);
                res = temp;
            }
            else{
                System.out.println(sum);
                prev.next = temp;
            }
            prev = temp;
            sum = carry;
            if(head1 != null){
                head1 = head1.next;
            }
            if(head2 !=null){
                head2 = head2.next;
            }
        }
        if(carry > 0){
            res.next.data = carry;
        }
        while(res != null){
            System.out.print(res.data + "->");
            res = res.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(7);
        head2.next = new Node(6);
        head2.next.next = new Node(2);

        sumLists(head1, head2);
    }
}
