package Trees;

public class CheckBalanced {
    static class Node{
        Node left,right;
        int data;
        public Node(int d){
            this.data = d;
        }
    }

    public static int getDepth(Node node){
        if(node == null){
            return -1;
        }
        return (Math.max((getDepth(node.left)), getDepth(node.right) + 1));
    }

    public static boolean checkBalanced(Node node){

        if(node == null){
            return true;
        }

        int depthdiff = getDepth(node.left) - getDepth(node.right);
        if(Math.abs(depthdiff) > 1){
            return false;
        }
        else{
            return checkBalanced(node.left) && checkBalanced(node.right);
        }
    }

    public static void main(String[] args) {
        Node node = new Node(6);
        node.left = new Node(4);
        node.right = new Node(9);
        node.left.left = new Node(1);
        node.left.right = new Node(5);
        node.right.left = new Node(7);
        System.out.println(checkBalanced(node));
    }
}
