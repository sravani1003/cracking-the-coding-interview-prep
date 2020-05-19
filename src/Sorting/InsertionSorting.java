package Sorting;

public class InsertionSorting {
    public int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i - 1;
            int temp = array[i];
            while(j > -1 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {25,44,0,-25,255};
        InsertionSorting obj = new InsertionSorting();
        obj.insertionSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }
}
