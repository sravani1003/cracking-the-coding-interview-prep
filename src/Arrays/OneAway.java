package Arrays;

public class OneAway {
    public static boolean checkString(String s, String t){
        int count = 0;
        if(s.length() - t.length() > 1){
            return false;
        }
        if(s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    count++;
                }
                if(count > 1){
                    return false;
                }
            }
        }
        else{
            String s1 = (s.length() > t.length()) ? t : s;
            String s2 = (s.length() > t.length()) ? s : t;
            int i = 0;
            int j = 0;
            while(i < s1.length() && j < s2.length()){
                if(s1.charAt(i) != s2.charAt(j)){
                    if(i != j){
                        return false;
                    }
                    j++;
                }
                else {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "pales";
        String t = "ples";
        System.out.println(checkString(s, t));
    }
}
