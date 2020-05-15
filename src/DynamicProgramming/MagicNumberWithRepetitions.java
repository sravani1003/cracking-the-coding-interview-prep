package DynamicProgramming;

public class MagicNumberWithRepetitions {

    public int findMagicNumber(int[] arr){
        if(arr[arr.length - 1] == 0 || arr.length == 0){
            return -1;
        }
        return magicNumberCheck(arr, 0, arr.length - 1);
    }

    public int magicNumberCheck(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == mid){
            return mid;
        }
        int leftEnd = Math.min(mid - 1, arr[mid]);
        int magicNumberOnLeft = magicNumberCheck(arr, start, leftEnd);
        if(magicNumberOnLeft > 0) {
            return magicNumberOnLeft;
        }
        int rightStart = Math.max(mid + 1, arr[mid]);
        int magicNumberOnRight = magicNumberCheck(arr, rightStart, end);
        if(magicNumberOnRight > 0) {
            return magicNumberOnRight;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        MagicNumberWithRepetitions obj = new MagicNumberWithRepetitions();
        System.out.println(obj.findMagicNumber(arr));
    }
}
