package DynamicProgramming;

public class RecursiveMultiply {
    public int multiplication(int one,int two){
        int small = one < two ? one : two;
        int big = one < two ? two : one;

        int[] storeValues = new int[small + 1];
        if(small == 0){
            return 0;
        }
        if(small == 1){
            return big;
        }
        int product = multiplication(small / 2, big);
        if(small % 2 == 0){
            return product + product;
        }
        else{
            return product + product + big;
        }
    }

    public static void main(String[] args) {
        int one = 21;
        int two = 15;
        RecursiveMultiply obj = new RecursiveMultiply();
        System.out.println(obj.multiplication(one,two));
    }
}
