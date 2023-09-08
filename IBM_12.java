public class IBM_12 {
    public static void main(String[] args) {
        String st = "Wert2345yhb";
        int n = st.length();
        String c = "";
        String num = "";
        for(int i=0; i<n; i++){
            if(Character.isDigit(st.charAt(i))){
                num+=st.charAt(i);
            }
            else{
                c += st.charAt(i);
            }
        }

        for(int i=0; i<c.length(); i++){
            System.out.print(c.charAt(i));
        }
        System.out.println();
        for(int i=0; i<num.length(); i++){
            System.out.print(num.charAt(i));
        }
    }
}
