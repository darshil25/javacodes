public class substring {

    public static String SubStr(String s, int si, int ei) {
        String subs = "";
        for (int i = si; i < ei; i++) {
            subs = subs + s.charAt(i);
        }
        return subs;
    }

    public static void main(String[] args) {
        String str = "HelloDarshil";
        System.out.println(SubStr(str, 0, 7));

        //There is function already exist in java that can give you substring which is
        System.out.println(str.substring(0,7));
    }
}
