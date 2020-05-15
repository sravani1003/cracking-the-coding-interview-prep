package DynamicProgramming;

public class MagicNumber {
    public int findMagicNumber(int[] arr){
        if(arr.length == 0 || arr[arr.length - 1] == 0){
            return -1;
        }
        return magicNumber(arr, 0, arr.length - 1);
    }

    public int magicNumber(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == mid){
            return mid;
        }
        else if(arr[mid] < mid){
            return magicNumber(arr, mid + 1, end);
        }
        else{
            return magicNumber(arr, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,3,4,5,7};
        MagicNumber obj = new MagicNumber();
        System.out.println(obj.findMagicNumber(arr));
    }
}
