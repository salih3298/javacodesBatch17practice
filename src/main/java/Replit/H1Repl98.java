package Replit;

/*  Create a String given="Hello Syntax friends".

Using String methods from given String create new String "Welcome Syntax family"
*/
class H1Repl98 {
    public static void main(String[] args) {
        String given = "Hello Syntax friends";

        String newGiven = given.replace("Hello", "Welcome");
        System.out.println(newGiven.replace("friends", "family"));


    }

}

