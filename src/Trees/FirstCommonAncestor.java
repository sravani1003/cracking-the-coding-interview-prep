package Trees;

public class FirstCommonAncestor {
    static class Node{
        int data;
        Node left,right;
        public Node(int d){
            this.data = d;
        }
    }
    static Node root;
    static boolean v1 = false;
    static boolean v2 = false;
    public static Node commonAncestor(Node node, int n1, int n2){
        if(node == null){
            return null;
        }
        Node temp = null;

        if(n1 == node.data){
            v1 = true;
            temp = node;
        }

        if(n2 == node.data){
            v2 = true;
            temp = node;
        }

        Node leftTree = commonAncestor(node.left, n1, n2);
        Node rightTree = commonAncestor(node.right, n1, n2);

        if(temp != null){
            return temp;
        }

        if(leftTree != null && rightTree != null){
            return node;
        }

        return leftTree != null ? leftTree : rightTree;
    }

    public static Node findCommonAncestor(int n1, int n2){
        v1 = false;
        v2 = false;

        Node ancestor = commonAncestor(root, n1, n2);

        if(v1 && v2){
            return ancestor;
        }
        return null;
    }

    public static void main(String[] args) {
        FirstCommonAncestor node = new FirstCommonAncestor();
        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);
        node.root.left.right = new Node(5);
        node.root.right.left = new Node(6);
        node.root.right.right = new Node(7);
        Node res = findCommonAncestor(3, 7);
        System.out.println(res.data);

    }
}
