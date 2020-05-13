package Arrays;

import java.util.HashSet;
import java.util.ServiceConfigurationError;
import java.util.Set;

public class OneNumber {
    public static boolean checkNumber(int n){
        Set<Integer> set = new HashSet<>();
        while(n>0){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                return false;
            }
            int val = calculate(n);
            if(val == 1){
                return true;
            }
            n = val;
        }
        return false;
    }
    public static int calculate(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int n = 1238933;
        System.out.println(checkNumber(n));
    }
}
