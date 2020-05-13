package BitManipulation;

public class BinaryToString {
    public String binaryToString(double number){
        if(number <= 0 || number >= 1){
            return "ERROR";
        }
        double fraction = 0.5;
        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while(number > 0){
            System.out.println(binary.toString());
            if(binary.length() >= 32){
                System.out.println(binary.length());
                return "ERROR";
            }
            if(number >= fraction){
                binary.append(1);
                number -= fraction;
            }
            else {
                binary.append(0);
            }
            fraction /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        double num = 0.4;
        BinaryToString obj = new BinaryToString();
        System.out.println(obj.binaryToString(num));
    }
}
