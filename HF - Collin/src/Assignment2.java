import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    // standard final static variables that all methods can share
    final static PrintStream cout = System.out;
    final static Scanner cin = new Scanner(System.in);
    final static Random rand = new Random();

    public static void main(String[] args) {
        // output identification
        cout.print("CPS 150 Assignment 2 by __your name here___ \n\n");

        cout.println("What is your first and last name?");
        String name = cin.nextLine();
        cout.println("Welcome "+name+" I will now ask 10 questions.");
        int count = 0;
        int correct = 0;
        while(count != 10)
        {
            count++;
            boolean flag = oneProblem(count);
            if(flag) {
                correct++;
            }
        }
        report(name, count, correct);
        cout.print("\nAssignment 2 complete\n\n");
    } // end main

    // function to present one problem to the learner
    static boolean oneProblem(int qno) {

        int one = 10 +rand.nextInt(90);
        int two = 10 +rand.nextInt(90);
        int answer = one+two;
        System.out.println("Problem "+qno+ ": "+one +" + "+two+" = ");
        int userAnswer = cin.nextInt();
        if(userAnswer == answer)
        {
            cout.println("Your answer is correct!");
            return true;
        }
        else {
            cout.println("Your answer is wrong. The correct answer is "+answer);
            return false;
        }// to let the program compile
    } // end function

    static void report(String name, int numProbs, int numCorrect) {
        cout.println("Test report for "+ name);
        cout.println("\nQuestions attempted: "+numProbs);
        cout.println("Questions correct: " +numCorrect);
        if(numCorrect == 10)
        {
            cout.println("You got perfect!");
        }
        else if(numCorrect >=8)
        {
            cout.println("You did alright");
        }
        else if(numCorrect ==7)
        {
            cout.println("You pass but should try to do better.");
        }
        else{
            cout.println("You really need to study harder.");
        }
        cout.println("You got a " + LetterGrade(numProbs, numCorrect));

    } // end function

    static char LetterGrade(int numProbs, int numCorrect) {

        if(numCorrect == 10)
        {
            return 'A';
        }
        else if(numCorrect == 8)
        {
            return 'B';
        }
        else if(numCorrect == 7)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }


    } // end function


}
