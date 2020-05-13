package Trees;

public class CheckSubtree {
    static class Node{
        int data;
        Node left,right;
        public Node(int d){
            this.data = d;
        }
    }

    public static boolean checkSubtree(Node node1, Node node2){
        if(node2 == null){
            return true;
        }
        if(node1 == null){
            return false;
        }
        else{
            if(node1.data == node2.data && matchTree(node1, node2)){
                return true;
            }
        }

        return checkSubtree(node1.left, node2) || checkSubtree(node1.right, node2);
    }

    static boolean matchTree(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }
        else if(node1 == null || node2 == null){
            return false;
        }
        else if(node1.data != node2.data){
            return false;
        }
        else{
            return matchTree(node1.left, node2.left) && matchTree(node1.right, node2.right);
        }

    }

    public static void main(String[] args) {
        Node node1 = new Node(6);
        node1.left = new Node(3);
        node1.right = new Node(8);
        node1.left.left = new Node(1);
        node1.left.right = new Node(4);
        Node node2 = new Node(7);
        node2.left = new Node(3);
        node2.right = new Node(10);
        node2.left.left = new Node(1);
        node2.left.right = new Node(4);
        System.out.println(checkSubtree(node1, node2));
    }
}
