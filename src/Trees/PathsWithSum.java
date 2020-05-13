package Trees;

public class PathsWithSum {
    static class Node{
        Node left,right;
        int data;
        public Node(int d){
            this.data = d;
        }
    }

    public static int calculatePathsCount(Node node, int k){
        if(node == null){
            return 0;
        }

        int pathsFromRoot = calculatePathsCount(node, k, 0);
        int pathsFromLeft = calculatePathsCount(node.left, k);
        int pathsFromRight = calculatePathsCount(node.right, k);

        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }

    public static int calculatePathsCount(Node node, int k, int currentSum){
        if(node == null){
            return 0;
        }

        currentSum += node.data;
        int totalPaths = 0;
        if(currentSum == k){
            totalPaths++;
        }
        totalPaths += calculatePathsCount(node.left, k, currentSum);
        totalPaths += calculatePathsCount(node.right, k, currentSum);

        return totalPaths;
    }

    public static void main(String[] args) {
        Node node = new Node(8);
        node.left = new Node(7);
        node.right = new Node(3);
        node.left.left = new Node(2);
        node.left.right = new Node(1);
        node.right.left = new Node(5);

        System.out.println(calculatePathsCount(node, 8));
    }
}
