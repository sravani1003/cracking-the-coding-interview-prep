package Sorting;

public class BubbleSort {
    public int[] bubbleSort(int[] array){
        boolean swap = false;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }

            if(swap == false){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,1,7,2,6,4,9,8};
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(array);
        for(int i = 0 ; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }
}
