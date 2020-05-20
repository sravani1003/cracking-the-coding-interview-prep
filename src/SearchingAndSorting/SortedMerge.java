package SearchingAndSorting;

public class SortedMerge {
    static int NA = -1;
    public int[] sortArrays(int[] firstArray, int[] secondArray, int lastFirst, int lastSecond){
        if(firstArray.length == 0 && secondArray.length == 0){
            return null;
        }
        if(secondArray.length == 0){
            return firstArray;
        }
        if(firstArray.length == 0){
            return secondArray;
        }
        int indexFirst = lastFirst - 1;
        int indexSecond = lastSecond - 1;
        int finalArraySize = indexFirst + indexSecond + 1;

        if(firstArray[indexFirst] < secondArray[indexSecond]){
            for(int i = indexFirst + 1, j = 0; i <= finalArraySize && j <= indexSecond; i++, j++){
                firstArray[i] = secondArray[j];
            }
        }
        int j;
        for(j = indexFirst; j >= 0; j--){
            firstArray[finalArraySize] = Math.max(firstArray[j], secondArray[indexSecond]);
            firstArray[finalArraySize - 1] = Math.min(firstArray[j], secondArray[indexSecond]);
            finalArraySize -= 2;
            indexSecond--;
            if(indexSecond < 0){
                break;
            }

        }

        if(j > 0){
            for(int k = j; k > 0; k--){
                if(firstArray[k] < firstArray[k - 1]){
                    int temp = firstArray[k];
                    firstArray[k] = firstArray[k - 1];
                    firstArray[k - 1] = temp;
                }
            }
        }

        return firstArray;
    }

    public static void main(String[] args) {
        int[] firstArray = {1,4,5,6,9,NA,NA,NA};
        int size_first = 8;
        int[] secondArray = {2,7,14};
        SortedMerge obj = new SortedMerge();
        obj.sortArrays(firstArray,secondArray,5,3);
        for(int i = 0; i < size_first; i++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
    }
}
