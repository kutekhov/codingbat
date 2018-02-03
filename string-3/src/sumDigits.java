
public class sumDigits {
    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum = sum + str.charAt(i) - '0';
        }

        return sum;
    }
}