package Trees;

class Node{
    int key;
    Node left,right;
    public Node(int key){
        this.key = key;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }

    void postOrder(){
        postOrder(root);
    }

    void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }

    void preOrder(){
        preOrder(root);
    }

    void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
    }

    void inOrder(){
        inOrder(root);
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder();
    }
}
