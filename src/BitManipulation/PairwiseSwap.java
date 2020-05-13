package BitManipulation;

public class PairwiseSwap {
    public int pairwiseSwap(int number){
        int oddPositions = number & 0xAAAAAAAA;

        int evenPositions = number & 0x55555555;

        evenPositions >>= 1;
        oddPositions <<= 1;

        return evenPositions | oddPositions;
    }

    public static void main(String[] args) {
        int num = 29;
        PairwiseSwap obj = new PairwiseSwap();
        System.out.println(obj.pairwiseSwap(num));
    }
}
