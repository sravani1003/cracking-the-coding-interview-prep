package Arrays;

public class RotateMatrix {
    public static void rotateMatrix(int[][] arr){
        if(arr.length == 0 || arr.length != arr[0].length){
            System.out.println("not possible");;
        }
        int n = arr.length;
        for(int i = 0;i < n / 2;i++){
            int first = i;
            int last = n - i - 1;
            for(int j = first;j < last;j++){
                int offset = j - first;
                int last_offset = last - j;
                int top = arr[first][j];
                arr[first][j] = arr[last_offset][first];
                arr[last_offset][first] = arr[last][last_offset];
                arr[last][last_offset] = arr[j][last];
                arr[j][last] = top;
            }
        }
        for(int[] i : arr){
            for(int j : i){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4}, {12,13,14,5}, {11,16,15,6}, {10,9,8,7}};
        rotateMatrix(arr);
    }
}
