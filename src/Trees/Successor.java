package Trees;

public class Successor {
    static class Node{
        Node left,right,parent;
        int data;
        public Node(int d, Node parent){
            this.data = d;
            this.parent = parent;
        }
    }

    public static Node checkSuccessor(Node node){
        if(node == null){
            return null;
        }

        if(node.right != null){
            return leftMostChild(node.right);
        }
        else{
            Node x = node;
            Node p = x.parent;
            while(x != null && x.left != p){
                x = p;
                p = p.parent;
            }
            return p;
        }
    }

    public static Node leftMostChild( Node node){
        if(node == null){
            return null;
        }
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        Node node = new Node(1,null);
        node.left = new Node(2, node);
        node.right = new Node(3, node);
        node.left.left = new Node(4, node.left);
        node.left.right = new Node(5, node.left);
        node.right.right = new Node(6, node.right);
        System.out.println(checkSuccessor(node).data);

    }
}
