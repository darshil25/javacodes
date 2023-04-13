public class Time {
    public static void main(String[] args) {
        long ctime = System.currentTimeMillis();
        System.out.println(ctime);

        long tsec = ctime/1000;
        System.out.println("total second is "+tsec);

        long csec = ctime%1000;
        System.out.println("current sec is "+csec);
        
        long tmin = tsec/60;
        System.out.println("total minute is "+tmin);

        long cmin = tsec%60;
        System.out.println("current minute is "+cmin);

        long thour = tmin/60;
        System.out.println("total hour is "+thour);

        long chour = tmin%60;
        System.out.println("current hour is "+chour);

        System.out.println("current time in GMT IS "+ chour+":"+cmin+":"+csec);
    }
}
