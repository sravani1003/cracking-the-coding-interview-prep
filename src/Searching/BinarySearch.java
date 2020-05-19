package Searching;

public class BinarySearch {

    public int searchEle(int[] array, int element, int start, int end){
        if (end >= 1) {
            int mid = (start + end) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                return searchEle(array, element, mid + 1, end);
            } else {
                return searchEle(array, element, start, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.searchEle(array, 7, 0, array.length - 1));
    }
}
