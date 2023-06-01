
import java.util.Scanner;

public class LOOP {


    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately you failed to pass the exam.");
        }
    }
}

class NestedIfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        char grade;
        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            if (marksObtained > 90)
                grade = 'A';
            else if (marksObtained > 75)
                grade = 'B';
            else if (marksObtained > 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("You passed the exam and your grade is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }
    }
}

class OddOrEven
{
    public static void main(String args[])
    {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if ( x % 2 == 0 )
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
