package Sorting;

import BitManipulation.Insertion;

public class InsertionSort {
    public int[] insertionSort(int[] array){
        int temp;
        for(int i = 1; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    temp = array[j];
                    int k = j;
                    while(k > i){
                        if(array[k - 1] > temp){
                            array[k] = array[k - 1];
                        }
                        k--;
                    }
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {25,44,0,-25,255};
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }
}
