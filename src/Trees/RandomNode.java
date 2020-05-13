package Trees;

import java.util.Random;

public class RandomNode {

    private int data;
    public RandomNode left,right;
    private int size = 0;
    public RandomNode(int d){
        this.data = d;
        size = 1;
    }


    public RandomNode getRandomNode(){
        int leftSize = (left == null) ? 0 : left.size;
        Random random = new Random();
        int i = random.nextInt(size);
        if(i < leftSize){
            return left.getRandomNode();
        }
        else if(i == leftSize){
            return this;
        }
        else{
            return right.getRandomNode();
        }
    }

    public void insertNode(int d){
        if(d <= data){
            if(left == null){
                left = new RandomNode(d);
            }
            else{
                left.insertNode(d);
            }
        }
        else{
            if(right == null){
                right = new RandomNode(d);
            }
            else {
                right.insertNode(d);
            }
        }
        size++;
    }

    public RandomNode find(int d){
        if(d == data){
            return this;
        }
        else if(d < data){
            return left == null ? null : left.find(d);
        }
        else{
            return right == null ? null : right.find(d);
        }
    }

//    public static void main(String[] args) {
//        RandomNode node = new RandomNode(3);
//        node.left = new RandomNode(1);
//        node.right = new RandomNode(2);
//        node.left.left = new RandomNode(0 );
//        node.left.right = new RandomNode(5);
//        node.right = new RandomNode(6);
//        RandomNode n = getRandomNode();
//        System.out.println(n.data);
//        RandomNode m = find(5);
//        insertNode(10);
//    }

}
