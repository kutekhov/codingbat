public class frontTimes {
    public String frontTimes(String str, int n) {
        char[] result;
        String front;

        if (str.length() < 3)
            front = str;
        else
            front = str.substring(0, 3);

        result = new char[n * front.length()];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < front.length(); j++) {
                result[index] = front.charAt(j);
                index++;
            }
        }

        return new String(result);
    }
}