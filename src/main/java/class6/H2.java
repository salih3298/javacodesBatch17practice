package class6;


public class H2 {
    public static void main(String[] args) {

/*Write a program that will read three inputs of scores
(quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/

double quiz=80;
double midTerm=70;
double finalScores=95;

        if ((quiz+midTerm+finalScores)/3 >=90) {
            System.out.println("Grade A");
        } else if ((quiz+midTerm+finalScores)/3 <90 && (quiz+midTerm+finalScores)/3>=70 ) {
            System.out.println("Grade B");
        } else if ((quiz+midTerm+finalScores)/3 <70 && (quiz+midTerm+finalScores)/3>=50 ) {
            System.out.println("Grade C");
        } else  {
            System.out.println("Grade F");
            }
        }
    }
