public class comboString {
    public String comboString(String a, String b) {
        if(b.length() < a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        return a + b + a;
    }

}
