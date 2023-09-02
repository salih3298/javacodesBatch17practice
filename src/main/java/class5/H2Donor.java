package class5;

public class H2Donor {
    public static void main(String[] args) {
       // Create a Java program and call it a Donor.
       // In order to be eligible to donate your blood you have to be 18 years old.
        // Also once you identify age eligibility then we have to see if person matches weight requirements.
        // If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.

         double age = 12;
         double weight = 100;
         if (age>18){
             if(weight>110) System.out.println("He/She is eligible for donation");
         } else {
             System.out.println("We cannot accept such a patient");
         }

        }
    }

