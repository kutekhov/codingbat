public class lastChars {
    public String lastChars(String a, String b) {
        String first = "@";
        String last = "@";;

        if(a.length() > 0)
            first = a.substring(0,1);

        if(b.length() > 0)
            last = b.substring(b.length() - 1);

        return first + last;
    }

}
