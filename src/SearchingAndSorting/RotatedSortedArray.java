package SearchingAndSorting;

public class RotatedSortedArray {
    public int findElement(int[] array, int number, int start, int end){
        if(array.length == 0){
            return -1;
        }
        int mid = (start + end) / 2;
        if(array[mid] == number){
            return mid;
        }
          if(array[start] < array[mid]){
              if(number >= array[start] && number < array[mid]){
                  return findElement(array, number, start, mid - 1);
              }
              else{
                  return findElement(array, number, mid + 1, end);
              }
          }
          else if(array[start] > array[mid]){
              if(number <= array[end] && number > array[mid]){
                  return findElement(array, number, mid + 1, end);
              }
              else{
                  return findElement(array, number, start, mid - 1);
              }
          }
          else if(array[start] == array[mid]){
              if(array[mid] != array[end]){
                  return findElement(array, number, mid + 1, end);
              }
              else{
                  int index = findElement(array, number, start, mid - 1);
                  if(index == -1){
                      return findElement(array, number, mid + 1, end);
                  }
                  else{
                      return index;
                  }
              }
          }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 1, 4, 5, 7, 9};
        RotatedSortedArray obj = new RotatedSortedArray();
        System.out.println(obj.findElement(array, 5, 0, array.length - 1));
    }
}
