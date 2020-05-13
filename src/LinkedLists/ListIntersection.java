package LinkedLists;

public class ListIntersection {
    static class Node{
        Node next;
        int data;
        public Node(int d){
            this.data = d;
        }
    }
    static class Result{
        Node tail;
        int size;
        public Result(Node tail, int size){
            this.tail = tail;
            this.size = size;
        }
    }

    public static boolean listIntersection(Node head1, Node head2){
        if(head1 == null || head2 == null){
            return false;
        }

        Result result1 = getTailAndSize(head1);
        Result result2 = getTailAndSize(head2);

        if(result1.tail != result2.tail){
            return false;
        }

        Node shortList = result1.size < result2.size ? head1 : head2;
        Node longList = result1.size < result2.size ? head2 : head1;

        longList = getKthNode(longList, Math.abs(result1.size - result2.size));

        while(shortList != longList){
            shortList = shortList.next;
            longList = longList.next;
        }

        if(shortList != longList){
            return false;
        }

        return true;
    }

    static Result getTailAndSize(Node head){
        if(head == null){
            return null;
        }

        int listSize = 1;
        Node current = head;
        while(current.next != null){
            listSize++;
            current = current.next;
        }
        return new Result(current, listSize);
    }

    static Node getKthNode(Node head, int size){
        Node current = head;
        while(size > 0 && current != null){
            current = current.next;
            size--;
        }
        return current;
    }

    public static void main(String[] args) {
        Node new1 = new Node(3);
        new1.next = new Node(1);
        new1.next.next = new Node(5);
        new1.next.next.next = new Node(9);
        new1.next.next.next.next = new Node(7);
        new1.next.next.next.next.next = new Node(2);
        new1.next.next.next.next.next.next = new Node(1);

        Node new2 = new Node(4);
        new2.next = new Node(6);
        new2.next.next = new Node(7);
        new2.next.next.next = new Node(2);
        new2.next.next.next.next = new Node(1);

        System.out.println(listIntersection(new1, new2));
    }
}
