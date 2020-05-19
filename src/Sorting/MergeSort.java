package Sorting;

public class MergeSort {
    public void mergeSort(int[] array, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public void merge(int[] array, int start, int mid ,int end){
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for(int i = 0; i < leftSize; i++){
            leftArray[i] = array[start + i];
        }
        for(int j = 0; j < rightSize; j++){
            rightArray[j] = array[mid + 1 + j];
        }

        int l = 0, r = 0;
        int k = start;
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[k] = leftArray[l];
                l++;
            }
            else{
                array[k] = rightArray[r];
                r++;
            }
            k++;
        }

        while(l < leftSize){
            array[k] = leftArray[l];
            l++;
            k++;
        }

        while(r < rightSize){
            array[k] = rightArray[r];
            r++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,4,7,1,2,9,6};
        MergeSort obj = new MergeSort();
        obj.mergeSort(array, 0, array.length - 1);
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }
}
