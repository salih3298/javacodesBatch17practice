package class12;

public class T3MethodsTester {

    public static void main(String[] args) {

        T3Methods t3=new T3Methods();
        t3.createEmail("salih","aygun","gmail");
        System.out.println(t3.createEmail("salih","aygun","gmail"));
    }
   String createEmail(String firstName, String lastName, String emailType) {

        String email;
        email=firstName+lastName+"@"+emailType+".com";

        return email;

         }
}

