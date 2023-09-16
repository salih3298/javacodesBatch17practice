package class23;

public class RegistrationClass {
    private String email;
    private String userName;
    private String password;

    public RegistrationClass(String email, String userName, String password) {

        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    void setEmail(String email) {

        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("not allowed");
        }
    }

    void setUserName(String userName) {
        if (userName.length() > 6 && !userName.isEmpty()) {
            this.userName = userName;
        } else {
            System.out.println("not allowed");
        }
    }

    void setPassword(String password) {
        if (password.length() > 6 && !password.isEmpty() && password!=userName) {
            this.password = password;
        } else {
            System.out.println("not allowed");
        }

    }


}

class RegistrationClassTester {
    public static void main(String[] args) {


        //RegistrationClass r = new RegistrationClass("salih3298@yahoo.com", "salih328", "7125318");
RegistrationClass r=new RegistrationClass("salih3298@yahoo.com", "785","hhks");
       // RegistrationClass r1 = new RegistrationClass("salih3298@yahoo.com", "salih328", "7125318");
        r.setEmail("salih3298@ygmoo.com");
        r.setPassword("745");
        r.setUserName("s54a8");

        System.out.println(r.getEmail());
        System.out.println(r.getPassword());
        System.out.println(r.getUserName());
    }
}