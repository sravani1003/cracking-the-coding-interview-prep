package Trees;

public class ValidateBST {
    static class Node{
        Node left, right;
        int data;
        public Node(int d){
            this.data = d;
        }
    }

    public static boolean validateBST(Node node){

        return validateBST(node, null, null);
    }
    public static boolean validateBST(Node node,Integer min, Integer max){
        if (node == null){
            return true;
        }
        if((min != null && node.data <= min) || (max != null && node.data >= max)){
            return false;
        }
        if(!validateBST(node, min, node.data) || !validateBST(node, node.data, max)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(8);
        node.right = new Node(13);
        node.left.left = new Node(5);
        node.left.right = new Node(9);
        node.right.left = new Node(11);
        node.right.right = new Node(15);

        System.out.println(validateBST(node));
    }
}
