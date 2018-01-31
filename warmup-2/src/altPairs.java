public class altPairs {
        public String altPairs(String str) {
            char[] result = new char[str.length()];
            int count = 0;

            int i = 0;
            int inc = 1;
            while (i < str.length()) {
                result[count] = str.charAt(i);
                count++;
                i += inc;

                if (inc == 1)
                    inc = 3;
                else
                    inc = 1;
            }

            return new String(result, 0, count);
        }
    }

