public class M20Q5_TowerOfHanoi {

    public static void toh(int n, String start, String helper, String dest){
        if(n == 1){
            System.out.println("Transfered disk no" + n + " from " + start + " to "+dest);
            return;
        }
        toh(n-1, start, dest, helper);
        System.out.println("Transfered disk no" + n + " from " + start + " to "+dest);
        toh(n-1, helper, start, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        toh(3, "S", "H", "D");
    }
}
