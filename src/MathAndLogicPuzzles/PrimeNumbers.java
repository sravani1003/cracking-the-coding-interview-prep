package MathAndLogicPuzzles;

import BitManipulation.PairwiseSwap;

public class PrimeNumbers {
    public String checkPrime(int number){
        String allPrimes = "";
        allPrimes = allPrimes + 2 + " ";
        for(int i = 1; i < number; i+= 2){
            if(isPrime(i)){
                allPrimes = allPrimes + i + " ";
            }
        }
        return allPrimes;
    }
    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 100;
        PrimeNumbers obj = new PrimeNumbers();
        System.out.println(obj.checkPrime(num));
    }
}
