package BitManipulation;

public class NextNumber {
    public int nextNumber(int number){
        int blockOfOnes = 0;
        int blockOfZeros = 0;
        int currentPosition = number;

        while((currentPosition & 1) == 0 && currentPosition != 0){
            blockOfZeros++;
            currentPosition >>= 1;
        }
        while ((currentPosition & 1) == 1){
            blockOfOnes++;
            currentPosition >>=1;
        }
        if(blockOfOnes + blockOfZeros == 31 || blockOfOnes + blockOfZeros == 0){
            return -1;
        }
        int zeroToFlip = blockOfOnes + blockOfZeros;

        number |= (1 << zeroToFlip);
        number &= ~((1 << zeroToFlip) - 1);
        number |= (1 << (blockOfOnes -1)) - 1;

        return  number;
    }

    public int prevNumber(int number){
        int blockOfOnes = 0;
        int blockOfZeros = 0;
        int currentPosition = number;

        while ((currentPosition & 1) == 1){
            blockOfOnes++;
            currentPosition >>=1;
        }

        while((currentPosition & 1) == 0 && currentPosition != 0){
            blockOfZeros++;
            currentPosition >>= 1;
        }

        if(blockOfOnes + blockOfZeros == 31 || blockOfOnes + blockOfZeros == 0){
            return -1;
        }
        int zeroToFlip = blockOfOnes + blockOfZeros;

        number &= ((~0) << (zeroToFlip + 1));

        int mask = (1 << (blockOfOnes + 1)) - 1;
        number |= mask << (blockOfZeros - 1);

        return  number;
    }


    public static void main(String[] args) {
        int number = 13948;
        NextNumber obj = new NextNumber();
        System.out.println(obj.nextNumber(number));
        System.out.println(obj.prevNumber(number));
    }
}
