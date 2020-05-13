package Arrays;

public class CheckPermutation {
    public static boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[128];
        for(int i = 0;i < s1.length();i++){
            count[s1.charAt(i)] += 1;
        }
        for(int i = 0;i < s2.length();i++){
            count[s2.charAt(i)] -=1;
            if(count[s2.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "taew";
        System.out.println(checkPermutation(s1, s2));
    }
}
