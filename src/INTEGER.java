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