package Sorting;

public class QuickSort {
    public int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return (i + 1);
    }

    public void quickSort(int[] array, int start, int end){
        if(start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {25,44,0,-25,255};
        QuickSort obj = new QuickSort();
        obj.quickSort(array, 0, array.length - 1);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
