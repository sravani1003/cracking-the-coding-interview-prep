package Trees;

public class MinimalTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            this.data = data;
        }
    }

    Node createMinimalTree(int[] arr){
        if(arr.length == 0){
            return null;
        }
        return createMinimalTree(arr, 0, arr.length - 1);
    }

    Node createMinimalTree(int[] arr, int x, int y){
        if(y < x){
            return null;
        }
        int mid = (x + y) / 2;
        Node node = new Node(arr[mid]);
        node.left = createMinimalTree(arr, x, mid-1);
        node.right = createMinimalTree(arr, mid+1, y);

        return node;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,7,3,0};
        MinimalTree obj = new MinimalTree();
        obj.createMinimalTree(arr);
    }
}
