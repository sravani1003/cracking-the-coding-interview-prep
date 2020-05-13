package Arrays;

import java.util.HashSet;
import java.util.Set;
//interview question
public class HappyNumber {

    public static boolean numberCheck(int n){
        Set<Integer> checkSet = new HashSet<>();
        System.out.println(n);
        int sum = 0;
        boolean check = false;
        while(n > 0){

            int temp = n % 10;
            sum = sum + temp * temp;
            n = n/10;

            if(sum == 1){
                System.out.println("n "+ n + " & sum "+ sum);
                return true;
            }
            if(n == 0){
                System.out.println("sum "+ sum);
                if(checkSet.contains(sum)){
                    break;
                }
                checkSet.add(sum);
                n = sum;
                sum = 0;

            }


        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(numberCheck(20));
    }
}
