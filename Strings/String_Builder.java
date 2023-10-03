public class String_Builder {

    public static void main(String[] args) {
        // created empty string builer and make changes through loop
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // .append(datatype) add characters behind exiting string
            sb.append(ch);
        }
        //prints final string that made from modification
        System.out.println(sb);
    }
}
