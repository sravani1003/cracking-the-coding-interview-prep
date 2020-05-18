package DynamicProgramming;

import java.util.Stack;

public class TowersOfHanoi {

    public static class Tower{
        Stack<Integer> disks;
        int index;
        public Tower(int i) {
            disks = new Stack<>();
            index = i;
        }

        public void add(int newDisk){
            if(!disks.isEmpty() && disks.peek() <= newDisk){
                System.out.println("Error adding disk");
            }
            else{
                disks.push(newDisk);
            }
        }

        public void moveDiskToTop(Tower destination){
            int top = disks.pop();
            destination.add(top);
        }

        public void moveDisks(int diskCount, Tower destination, Tower buffer){
            if(diskCount > 0){
                moveDisks(diskCount - 1, buffer, destination);
                moveDiskToTop(destination);
                buffer.moveDisks(diskCount - 1, destination, this);
            }
        }

    }
    public static void main(String[] args) {
        int numberOfDisks = 3;
        Tower[] towers = new Tower[numberOfDisks];
        for(int i = 0; i < 3; i++){
            towers[i] = new Tower(i);
        }
        for(int i = numberOfDisks - 1; i >= 0; i--){
            towers[0].add(i);
        }

        towers[0].moveDisks(numberOfDisks, towers[2], towers[1]);
    }
}
