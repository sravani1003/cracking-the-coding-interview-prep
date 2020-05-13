package Arrays;

public class URLify {
    public static void convertString(char[] s, int n){
        int count = 0, index = 0;
        for(int i = 0;i < n;i++){
            if(s[i] == ' '){
                count++;
            }
        }
        index = n + count * 2;
        if(n < s.length)
            s[n] = '\0';
        for(int i = n-1; i>=0; i--){
            if(s[i] == ' '){
                s[index-1] = '0';
                s[index-2] = '2';
                s[index-3] = '%';
                index = index - 3;
            }
            else {
                s[index - 1] = s[i];
                index--;
            }
        }
        for(char c : s){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        char[] s = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        int n = 13;
        convertString(s, n);
    }
}
