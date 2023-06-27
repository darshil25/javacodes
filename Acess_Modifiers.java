public class Acess_Modifiers {
    public static void main(String[] args) {
        BankAccount bAcc = new BankAccount();
        bAcc.username = "darshil"; // bcz of public class we can acess username here
        bAcc.password = "ABCDabcd"; //this will give error bcz password is acessible in BankAccount class only
        bAcc.SetPassword("ABCDabcd"); //this won't give error bcz we are using setPassword function which is public
    }

    static class BankAccount {
        /*
         * (Types)
         * Private - can be used within class
         * default - can be used in class + package
         * protected - can be used in class + package + outside package but within
         * subclass
         * public - can be used everwhere
         */

        public String username;
        private String password;
        public String SetPassword(String pwd){
            password = pwd;
            return password;
        }

    }
}
