public class string_compression {
    // method1
    public static String compress(String str) {
        // created empty string
        String NewS = "";

        for (int i = 0; i < str.length(); i++) {
            // initially take every characters count as 1
            // also at last we have to convert count into string so instead of int we take
            // Integer to convert it into object
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // adding first letter to new string
            NewS = NewS + str.charAt(i);
            if (count > 1) {
                NewS = NewS + count.toString(); // converted count into string
            }
        }
        return NewS;
    }

    // method2
    public static String compress_sb(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaaabbccd";
        System.out.println(compress(str));
        System.out.println(compress_sb(str));
    }
}
