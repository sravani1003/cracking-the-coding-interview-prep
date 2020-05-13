package Trees;

import java.util.*;

public class ListOfDepths {
    static class Node{
        Node left,right;
        int data;
        public Node(int d){
            this.data = d;
            //left = right = null;
        }
    }

    public static ArrayList<LinkedList<Node>> listOfDepths(Node node){
        if(node == null){
            return null;
        }
        ArrayList<LinkedList<Node>> result = new ArrayList<>();
        LinkedList<Node> current = new LinkedList<>();
        if(node != null){
            current.add(node);
        }
        while(current.size() > 0) {
            result.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();
            for (Node n : parents) {
                if (n.left != null) {
                    current.add(n.left);
                }
                if (n.right != null) {
                    current.add(n.right);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(8);
        node.left.left = new Node(10);
        node.left.right = new Node(15);
        node.right.left = new Node(2);
        listOfDepths(node);
    }
}
