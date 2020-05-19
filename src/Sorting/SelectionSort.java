package Sorting;

public class SelectionSort {
    public int[] selectionSort(int[] array){
        int min = 0;
        for(int i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,1,7,2,6,4,9,8};
        SelectionSort obj = new SelectionSort();
        obj.selectionSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }
}
