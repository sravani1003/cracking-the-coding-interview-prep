package SearchingAndSorting;


public class PeaksAndValleys {
    public int[] rearrangeArray(int[] array){
        for(int i = 1; i < array.length; i += 2){
            int maxValueIndex = getMaxValueIndex(array, i - 1, i, i + 1);
            if(i != maxValueIndex){
                int temp = array[i];
                array[i] = array[maxValueIndex];
                array[maxValueIndex] = temp;
            }
        }
        return array;
    }

    public int getMaxValueIndex(int[] array, int previous, int current, int next){
        int previousPosition = previous < array.length ? array[previous] : Integer.MIN_VALUE;
        int currentPosition = current < array.length ? array[current] : Integer.MIN_VALUE;
        int nextPosition = next < array.length ? array[next] : Integer.MIN_VALUE;

        int maxIndexValue = Math.max(previousPosition, Math.max(currentPosition, nextPosition));
        if(maxIndexValue == previousPosition){
            return previous;
        }
        else if(maxIndexValue == currentPosition){
            return current;
        }
        else{
            return next;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,6,1,2,8,4};
        PeaksAndValleys obj = new PeaksAndValleys();
        int[] result = obj.rearrangeArray(array);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }
        System.out.println();
    }
}
