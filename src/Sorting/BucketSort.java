package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
    public int[] bucketSort(int[] array){
        List<Integer>[] bucketsList = new List[array.length];
        for(int i = 0; i < array.length; i++){
            bucketsList[i] = new LinkedList<>();
        }
        for(int num : array){
            bucketsList[hash(num, array.length)].add(num);
        }

        for(List<Integer> l : bucketsList){
            Collections.sort(l);
        }

        int i = 0;
        for(List<Integer> list : bucketsList){
            for(int num : list){
                array[i++] = num;
            }
        }
        return array;
    }

    public int hash(int number, int size){
        return number / size;
    }

    public static void main(String[] args) {
        int[] array = {3,4,2,6,1,9,10};
        BucketSort obj = new BucketSort();
        obj.bucketSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
