
import java.util.Scanner;
import java.math.BigInteger;

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
        } else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }
    }
}

class OddOrEven {
    public static void main(String args[]) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x % 2 == 0)
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}

class Factorial {
    public static void main(String args[]) {
        int n, c, fact = 1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (c = 1; c <= n; c++)
                fact = fact * c;
            System.out.println("Factorial of " + n + " is = " + fact);
        }
    }
}

class BigFactorial {
    public static void main(String args[]) {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
    }
}

class CompareStrings {
    public static void main(String args[]) {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string");
        s1 = in.nextLine();


        System.out.println("Enter the second string");
        s2 = in.nextLine();
        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");
    }
}

class ForLoop {
    public static void main(String[] args) {
        int c;
        for (c = 1; c <= 10; c++) {
            System.out.println(c);
        }
    }
}

class Stars {
    public static void main(String[] args) {
        int row, numberOfStars;
        for (row = 1; row <= 10; row++) {
            for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println(); // Go to next line
        }
    }
}

class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }
}

class ReverseNumber {
    public static void main(String args[]) {
        int n, reverse = 0;
        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse of entered number is " + reverse);
    }
}

class BreakWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}

class Alphabets {
    public static void main(String args[]) {
        char ch;
        for (ch = 'a'; ch <= 'z'; ch++)

            System.out.println(ch);
    }
}

class EnhancedForLoop {
    public static void main(String[] args) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int t : primes) {
            System.out.println(t);
        }
    }
}

class EnhancedForLoop1 {
    public static void main(String[] args) {
        String languages[] = {"C", "C++", "Java", "Python", "Ruby"};
        for (String sample : languages) {
            System.out.println(sample);
        }
    }
}

class MultiplicationTable {
    public static void main(String args[]) {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n + " is :-");
        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n * c));
    }
}

class Tables {
    public static void main(String args[]) {
        int a, b, c, d;
        System.out.println("Enter range of numbers to print their multiplication table");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        for (c = a; c <= b; c++) {
            System.out.println("Multiplication table of " + c);
            for (d = 1; d <= 10; d++) {
                System.out.println(c + "*" + d + " = " + (c * d));
            }
        }
    }
}
class ArmstrongNumber
{
    public static void main(String args[])
    {
        int n, sum = 0, temp, remainder, digits = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
                n = in.nextInt();
        temp = n;
        // Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp/10;
        }
        temp = n;
        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }
        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
    static int power(int n, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++)
            p = p * n;
        return p;
    }
}
class FloydTriangle
{
    public static void main(String args[])
    {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
                n = in.nextInt();
        System.out.println("Floyd's triangle :-");
        for ( c = 1 ; c <= n ; c++ )
        {
            for ( d = 1 ; d <= c ; d++ )
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
class SubstringsOfAString
{
    public static void main(String args[])
    {
        String string, sub;
        int i, c, length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();
        length = string.length();



        System.out.println("Substrings of \""+string+"\" are :-");
        for( c = 0 ; c < length ; c++ )
        {
            for( i = 1 ; i <= length - c ; i++ )
            {
                sub = string.substring(c, c+i);
                System.out.println(sub);
            }
        }
    }
}
class ReverseString
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);
        System.out.println("Reverse of entered string is: "+reverse);
    }
}
//Using Internal java Methog
class InvertString
{
    public static void main(String args[])
    {
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println(a.reverse());
    }
}
class Palindrome1
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");
    }
}
//Another Method

class Palindrome
{
    public static void main(String args[])
    {
        String inputString;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        inputString = in.nextLine();
        int length = inputString.length();
        int i, begin, end, middle;
        begin = 0;
        end = length - 1;
        middle = (begin + end)/2;
        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }



        if (i == middle + 1) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}

class AddTwoMatrix
{
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix");
        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                first[c][d] = in.nextInt();
        System.out.println("Enter the elements of second matrix");
        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                second[c][d] = in.nextInt();
        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                sum[c][d] = first[c][d] + second[c][d]; //replace '+' with '-'

        System.out.println("Sum of entered matrices:-");
        for ( c = 0 ; c < m ; c++ )
        {
            for ( d = 0 ; d < n ; d++ )
                System.out.print(sum[c][d]+"\t");
            System.out.println();


        }
    }
}

class MatrixMultiplication
{
    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, c, d, k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
                m = in.nextInt();
        n = in.nextInt();
        int first[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix");
        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                first[c][d] = in.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix");
                p = in.nextInt();
        q = in.nextInt();
        if ( n != p )
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];
            System.out.println("Enter the elements of second matrix");
            for ( c = 0 ; c < p ; c++ )
                for ( d = 0 ; d < q ; d++ )
                    second[c][d] = in.nextInt();
            for ( c = 0 ; c < m ; c++ )
            {
                for ( d = 0 ; d < q ; d++ )
                {
                    for ( k = 0 ; k < p ; k++ )
                    {
                        sum = sum + first[c][k]*second[k][d];
                    }
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of entered matrices:-");
            for ( c = 0 ; c < m ; c++ )
            {
                for ( d = 0 ; d < q ; d++ )
                    System.out.print(multiply[c][d]+"\t");
                System.out.print("\n");
            }
        }
    }
}

class TransposeAMatrix
{
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of matrix");
        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                matrix[c][d] = in.nextInt();
        int transpose[][] = new int[n][m];
        for ( c = 0 ; c < m ; c++ )
        {
            for ( d = 0 ; d < n ; d++ )
                transpose[d][c] = matrix[c][d];
        }
        System.out.println("Transpose of entered matrix:-");
        for ( c = 0 ; c < n ; c++ )
        {
            for ( d = 0 ; d < m ; d++ )
                System.out.print(transpose[c][d]+"\t");
            System.out.print("\n");
        }
    }
}
