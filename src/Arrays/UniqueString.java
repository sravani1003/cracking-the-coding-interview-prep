package Arrays;

public class UniqueString {
    public static boolean uniqueString(String s){
        if(s.length() > 128){
            return false;
        }
        boolean[] unique = new boolean[128];
        for(int i = 0;i < s.length();i++){
            if(unique[s.charAt(i)]){
                return false;
            }
            else{
                unique[s.charAt(i)] = true;
                System.out.println((int)s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(uniqueString(s));
    }
}
