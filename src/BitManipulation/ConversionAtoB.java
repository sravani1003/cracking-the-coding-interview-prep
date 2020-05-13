package BitManipulation;

public class ConversionAtoB {
    public int conversionAtoB(int A, int B){
        int difference = A ^ B;
        int flipCount = 0;
        while(difference != 0){
            if((difference & 1) == 1){
                flipCount++;
            }
            difference >>= 1;
        }
        return flipCount;
    }

    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 15;
        ConversionAtoB obj = new ConversionAtoB();
        System.out.println(obj.conversionAtoB(number1, number2));
    }
}
