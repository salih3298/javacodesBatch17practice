package class18;

public class User {
     String name;
     String mobileNumber;

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends User {
    String userAddress;
    public UserInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }
    public void userDetail() {
        System.out.println(name + " " + mobileNumber + " " + userAddress);
    }
}
class TesterUser {
    public static void main(String[] args) {

        UserInfo u1 = new UserInfo("Salih Aygun", "123456789", "Turkey");
        u1.userDetail();

    }

}
