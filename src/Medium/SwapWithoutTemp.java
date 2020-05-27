package Medium;

public class SwapWithoutTemp {
    public int[] swapWithoutTemp(int[] array, int x, int y){
        array[x] = array[y] ^ array[x];
        array[y] = array[x] ^ array[y];
        array[x] = array[x] + array[y];
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,3,6,4,7,8};
        int x = 1;
        int y = 4;
        SwapWithoutTemp obj = new SwapWithoutTemp();
        int[] result = obj.swapWithoutTemp(array, x, y);
        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
