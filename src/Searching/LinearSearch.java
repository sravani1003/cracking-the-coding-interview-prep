package Searching;

public class LinearSearch {
    public int linearSearch(int[] array, int searchElement){
        for(int i = 0; i < array.length; i++){
            if(array[i] == searchElement){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array= {1,2,4,6,12,44};
        LinearSearch obj = new LinearSearch();
        System.out.println(obj.linearSearch(array, 6));
    }
}
