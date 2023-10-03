import java.util.Scanner;
public class M19Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i = sc.nextInt();
        Complex c1 = new Complex(r, i);
        Complex c2 = new Complex(i, r);
        System.out.println(c2.add(c1, c2));
    }
}

class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex(a.real+b.real, a.img+b.img);
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex(a.real-b.real, a.img-b.img);
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real) - (a.img*b.img)), ((a.real*b.real) + (a.img*b.img)));
    }

    public void Print(){
        if(real==0 & img!=0){
            System.out.println(img+"i");
        }
        else if(real != 0 && img == 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + " + " + img+"i");
        }
    }
}