import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class INTEGER {
    public static void main(String[] args) {
        int C; // declaring  a variable
        for (C = 1; C <= 100; C++) ;
        System.out.println(C);

    }
}

class ARGUMENTS {
    public static void main(String[] args) {
        for (String t : args) {
            System.out.println(t);

        }
    }
}


class GETINPUTFORMUSER {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter a String ");
        s = in.nextLine();
        System.out.println("you entered string " + s);
        System.out.println(" enter in interger");
        a = in.nextByte();
        System.out.println(" you entered interger" + a);
        System.out.println(" enter a float");
        b = in.nextFloat();
        System.out.println("you entered float " + b);


    }
}

class Fehremheittocelsius {
    public static void main(String[] args) {
        float temperture;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter temperature in fehremheit");
        temperture = in.nextFloat();
        temperture = ((temperture - 32) * 5) / 9;
        System.out.println(" temperture in celsius  =" + temperture);


    }
}

class Swapnumbers {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println(" before Swappping \nx = +x+\ny = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println(" before Swappping \nx = +x+\ny = " + y);

    }
}

class Swapnumbers1 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println(" before Swappping \nx = +x+\ny = " + y);

        x = y;

        System.out.println(" before Swappping \nx = +x+\ny = " + y);

    }
}
class ADDNUMBER {
    public static void main(String[] args) {
        int X, Y, Z;
        System.out.println(" enter two interger to calculate their sum ");
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        Y = in.nextInt();
        Z = X + Y;
        System.out.println(" SUM OF enter  INTERGER =" + Z);


    }
}
class subtraction {
    public static void main(String[] args) {
        int X, Y, Z;
        System.out.println(" enter two interger to calculate their sub ");
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        Y = in.nextInt();
        Z = X - Y;
        System.out.println(" SUM OF enter  INTERGER =" + Z);


    }
}

 class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation : ");
        System.out.println("1. Addition (-)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Error: Invalid operator!");
                break;
        }

        scanner.close();
    }
}
class Largestofthreenumber{
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("enter three intergers");
        Scanner in =new Scanner (System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x >y && x >z);
        System.out.println( "first number is enterger.");
         if ( y>x && y>z);
        System.out.println( "Second number is enterger.");
         if (z>x && z> y);
        System.out.println( "third number is enterger");

        System.out.println("enter the number of not distinct");


    }
}
class Condition{
    public static void main(String[] args) {
        boolean learning = true;
        if (learning) {

            System.out.println("java program");
        }
        else {
            System.out.println( "what are donig ");

        }

    }
}
