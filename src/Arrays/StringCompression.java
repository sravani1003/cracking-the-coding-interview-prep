package Arrays;

public class StringCompression {
    public static String stringCompress(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i < s.length();i++){
            count += 1;

            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        if(String.valueOf(sb).length() > s.length()){
            return s;
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String s = "aaaaAbbChh";
        System.out.println(stringCompress(s));
    }
}
