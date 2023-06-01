import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.net.InetAddress;

public class OOPs {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}

class StringEndwith {
    public static void main(String args[]) {
        String s1 = "java by TechnoLamror";
        System.out.println(s1.endsWith("r")); //true
        System.out.println(s1.endsWith("Lamror")); //true
        System.out.println(s1.endsWith("lamror"));//false
    }
}

class IndexOfExample {
    public static void main(String args[]) {
        String s1 = "this is index of example";
//passing substring
        int index1 = s1.indexOf("is");//returns the index of is substring
        int index2 = s1.indexOf("index");//returns the index of index substring
        System.out.println(index1 + " " + index2);//2 8
//passing substring with from index
        int index3 = s1.indexOf("is", 4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4 = s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}

class IndexOfExample2 {
    public static void main(String args[]) {
        String s1 = "this is index of example";
//passing substring
        int index1 = s1.indexOf("is");//returns the index of is substring
        int index2 = s1.indexOf("index");//returns the index of index substring
        System.out.println(index1 + " " + index2);//2 8
//passing substring with from index
        int index3 = s1.indexOf("is", 4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is
//passing char value
        int index4 = s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}

class ReplaceAllExample2 {
    public static void main(String args[]) {
        String s1 = "My name is Rajendra. My name is lamror. My name is Technolamror.";
        String replaceString = s1.replaceAll("is", "was");//replaces all occurrences of "is" to"was"
        System.out.println(replaceString);
    }
}

class SplitExample {
    public static void main(String args[]) {
        String s1 = "java string split method by Technolamror";
        String[] words = s1.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        for (String w : words) {
            System.out.println(w);
        }
    }
}

class StringTrimExample {
    public static void main(String args[]) {
        String s1 = " hello string ";
        System.out.println(s1 + "Technolamror");//without trim()
        System.out.println(s1.trim() + "Technolamror");//with trim()
    }
}

class StringLowerExample {
    public static void main(String args[]) {
        String s1 = "TECHNOLAMROR by Rajendralamror HELLO stRIng";
        String s1lower = s1.toLowerCase();


        System.out.println(s1lower);
    }
}

class Methods {
    // Constructor method
    Methods() {
        System.out.println("Constructor method is called when an object of it's class is created");
    }

    // Main method where program execution begins
    public static void main(String[] args) {
        staticMethod();
        Methods object = new Methods();
        object.nonStaticMethod();
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method can be called without creating object");
    }

    // Non static method
    void nonStaticMethod() {
        System.out.println("Non static method must be called by creating an object");
    }
}

class StringMethods {
    public static void main(String args[]) {
        int n;
        String s = "Java programming", t = "", u = "";
        System.out.println(s);
        // Find length of string
        n = s.length();
        System.out.println("Number of characters = " + n);
        // Replace characters in string
        t = s.replace("Java", "C++");
        System.out.println(s);
        System.out.println(t);
        // Concatenating string with another string
        u = s.concat(" is fun");
        System.out.println(s);
        System.out.println(u);
    }
}

class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method is executed.");
    }

    static {
        System.out.println("Static block is executed before main method.");
    }
}

//Static Block Application …. We need to open Program in speciif window
class StaticBlock1 {
    public static void main(String[] args) {
        System.out.println("You are using Windows_NT operating system.");
    }

    static {
        String os = System.getenv("OS");
        if (os.equals("Windows_NT") != true) {
            System.exit(1);
        }
    }
}

class Difference {
    public static void main(String[] args) {
        display(); //calling without object
        Difference t = new Difference();
        t.show(); //calling using object
    }

    static void display() {
        System.out.println("Programming is amazing.");
    }

    void show() {
        System.out.println("Java is awesome.");
    }
}

class Computer {
    Computer() {
        System.out.println("Constructor of Computer class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();
        my.computer_method();
        your.laptop_method();
    }
}

class Laptop {
    Laptop() {
        System.out.println("Constructor of Laptop class.");
    }

    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}

class Programming {
    //constructor method
    Programming() {
        System.out.println("Constructor method called.");
    }


    public static void main(String[] args) {
        Programming object = new Programming(); //creating object
    }
}

class Language {
    String name;

    Language() {
        System.out.println("Constructor method called.");
    }

    Language(String t) {
        name = t;
    }

    public static void main(String[] args) {
        Language cpp = new Language();
        Language java = new Language("Java");
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }

    void setName(String t) {
        name = t;
    }

    void getName() {
        System.out.println("Language name: " + name);
    }
}

class Division {
    public static void main(String[] args) {
        int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");


        a = input.nextInt();
        b = input.nextInt();
        // try block
        try {
            result = a / b;
            System.out.println("Result = " + result);
        }
        // catch block
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
    }
}

class TestThrow1 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote on Technolamror");
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}

class Allocate {
    public static void main(String[] args) {
        try {
            long data[] = new long[1000000000];
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block will execute always.");
        }
    }
}

interface Info {
    static final String language = "Java";

    public void display();
}

class Simple implements Info {
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.display();
    }

    // Defining method declared in interface
    public void display() {
        System.out.println(language + " is awesome");
    }
}

class SQLDateExample {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
    }
}
/// Another Way

class GetCurrentDateAndTime {
    public static void main(String args[]) {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);


        System.out.println("Current date is " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Current time is " + hour + " : " + minute + " : " + second);
    }
}


class SimpleDateFormatExample2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date formate chnage by Technolamror ");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);
    }
}

class RandomNumbers {
    public static void main(String[] args) {
        int c;
        Random t = new Random();
        // random integers in [0, 100]
        for (c = 1; c <= 10; c++) {
            System.out.println(t.nextInt(100));
        }
    }
}

class GarbageCollection {
    public static void main(String s[]) throws Exception {
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection =" + rs.freeMemory());
    }
}

class IPAddress {
    public static void main(String args[]) throws Exception {
        System.out.println(InetAddress.getLocalHost());
    }
}

class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class LinearSearch {
    public static void main(String args[]) {
        int c, n, search, array[];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " integers");
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        System.out.println("Enter value to find");
        search = in.nextInt();
        for (c = 0; c < n; c++) {
            if (array[c] == search) /* Searching element is present */ {
                System.out.println(search + " is present at location " + (c + 1) +
                        ".");
                break;
            }


        }
        if (c == n) /* Searching element is absent */
            System.out.println(search + " is not present in array.");
    }
}

 class StringToSQLDateExample {
    public static void main(String[] args) {
        String str="2015-03-31";
        long date= Date.parse(str);//converting string into sql date
        System.out.println(date);
    }
}
