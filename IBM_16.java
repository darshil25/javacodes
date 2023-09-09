//Roman to Int

public class IBM_16 {
    public static void main(String[] args) {
        String num = "LXXXIV";
        int l = num.length();
        int n = 0;

        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == 'I'){
                n += 1;
            }
            else if(num.charAt(i) == 'V'){
                n += 5;
            }
            else if(num.charAt(i) == 'X'){
                n += 10;
            }
            else if(num.charAt(i) == 'L'){
                n += 50;
            }
            else if(num.charAt(i) == 'C'){
                n += 100;
            }
        }

        if(l > 1){
            if(num.charAt(l-2) < num.charAt(l-1) && num.charAt(l-2) == 'I'){
                n -=  2;
            }
        }

        System.out.println(n);
    }
}
