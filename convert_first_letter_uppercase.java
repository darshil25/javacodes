public class convert_first_letter_uppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        // here converted oth index word to uppercase bcz sentence starting with
        // uppercase letter
        char ch = Character.toUpperCase(str.charAt(0));
        // added converted uppercase to sb (now sb = "H")
        sb.append(ch);

        // alredy converted 0th index to uppercase so start with 1
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString(); // we know that StringBuilder is not string so we converted it into string
    }

    public static void main(String[] args) {
        String string = "hi, my name is darshil thummar.";
        System.out.println(toUpperCase(string));
    }
}
