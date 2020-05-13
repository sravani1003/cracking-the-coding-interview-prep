package Arrays;

public class StringRotation {
    public static boolean stringRotate(String s1, String s2){
        boolean res;
        if(s1.length() != s2.length()){
            res = false;
        }
        else{
            String complete = s1 + s1;
            //res = isSubString(complete, s2);
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "lloeH";
        System.out.println(stringRotate(s1, s2));
    }
}
