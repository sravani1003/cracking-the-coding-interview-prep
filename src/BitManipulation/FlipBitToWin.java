package BitManipulation;

public class FlipBitToWin {
    public int flipBitToWin(int number){
        int onesSequenceCount = 0;
        int tempSequenceCount = 0;
        int longestSequence = 1;
        while(number != 0){
            if((number & 1) == 1){
                onesSequenceCount++;
            }
            else if((number & 1) == 0){
                tempSequenceCount = ((number & 2) == 0) ? 0 : onesSequenceCount;
                onesSequenceCount = 0;
            }
            longestSequence = Math.max(onesSequenceCount + tempSequenceCount + 1, longestSequence);
            number >>>= 1;
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int num = 1775;
        FlipBitToWin obj = new FlipBitToWin();
        System.out.println(obj.flipBitToWin(num));
    }
}
