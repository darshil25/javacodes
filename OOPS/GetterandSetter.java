public class GetterandSetter {
    public static void main(String[] args) {
        
    }
}

    class BankAccount{
        private String username;
        private String password;

        String getUsername(){     //get the value of username
            return this.username;
        }
        String getPassword(){     //get the value of password
            return this.password;
        }

        void setUsername(String usern){ //set value of username as value in usern
            this.username = usern;
        }
        void setPassword(String passw){ //set value of password as value in passw
            this.password = passw;
        }
    }
