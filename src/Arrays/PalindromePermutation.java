package Arrays;

public class PalindromePermutation {
    public static boolean palindromePermutation(String s){
        char[] chars = new char[128];
        int count = 0;
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) != ' ')
                chars[s.charAt(i)] +=1;
        }
        for(int i = 0;i < s.length();i++){
            if((chars[s.charAt(i)]) % 2 == 1){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "tact coa";
        System.out.println(palindromePermutation(s));
    }
}
