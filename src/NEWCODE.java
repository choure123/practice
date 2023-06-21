import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class NEWCODE {
    public static void main(String[] args) {
        System.out.println("welcome ");
    }
}

class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success.. by Technolamror.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DataStreamExample {


    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\Technolamror.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.technolamror.com/java");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.Technolamror.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class First extends Frame {
    First() {
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);// setting button position


        add(b);//adding button into frame
        setSize(300, 300);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
    }

    public static void main(String args[]) {
        First f = new First();
    }
}

class LabelExample {
    public static void main(String args[]) {
        Frame f = new Frame("Label Example by Technolamror");
        Label l1, l2;
        l1 = new Label("First Label.");
        l1.setBounds(50, 100, 100, 30);
        l2 = new Label("Second Label.");
        l2.setBounds(50, 150, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

class TextAreaExample {
    TextAreaExample() {
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome to Technolamror");
        area.setBounds(10, 30, 300, 300);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new TextAreaExample();
    }
}

class ChoiceExample {
    ChoiceExample() {


        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(100, 100, 75, 75);
        c.add("Item 1 by Rajendra");
        c.add("Item 2 by Lamror");
        c.add("Item 3 by Technolamror");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new ChoiceExample();
    }
}


class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame
        JButton b = new JButton("click");//creating instance of JButton
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
        f.add(b);//adding button in JFrame
        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}

class CheckBoxExample {
    CheckBoxExample() {
        JFrame f = new JFrame("CheckBox Example by Technolamror");
        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);
        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100, 150, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckBoxExample();
    }
}

class StringToIntExample {
    public static void main(String args[]) {
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(s + 100);//200100 because + is string concatenation operator
        System.out.println(i + 100);//300 because + is binary plus operator
    }
}

class IntToStringExample1 {
    public static void main(String args[]) {
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100);//300 because + is binary plus operator
        System.out.println(s + 100);//200100 because + is string concatenation operator
    }
}

class StringToLongExample {
    public static void main(String args[]) {
        String s = "9990449935";
        long l = Long.parseLong(s);
        System.out.println(l);
    }
}

class StringToFloatExample {
    public static void main(String args[]) {
        String s = "23.6";
        float f = Float.parseFloat("23.6");
        System.out.println(f);
    }
}

class StringToDoubleExample {
    public static void main(String args[]) {


        String s = "23.6";
        double d = Double.parseDouble("23.6");
        System.out.println(d);
    }
}

class StringToDateExample1 {
    public static void main(String[] args) throws Exception {
        String sDate1 = "31/12/1998";
        String sDate2 = "31-Dec-1998";
        String sDate3 = "12 31, 1998";
        String sDate4 = "Thu, Dec 31 1998";
        String sDate5 = "Thu, Dec 31 1998 23:37:50";
        String sDate6 = "31-Dec-1998 23:37:50";
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date1 = formatter1.parse(sDate1);
        Date date2 = formatter2.parse(sDate2);
        Date date3 = formatter3.parse(sDate3);
        Date date4 = formatter4.parse(sDate4);
        Date date5 = formatter5.parse(sDate5);
        Date date6 = formatter6.parse(sDate6);
        System.out.println("String to Date converter by technolamror");
        System.out.println(sDate1 + "\t" + date1);
        System.out.println(sDate2 + "\t" + date2);
        System.out.println(sDate3 + "\t" + date3);
        System.out.println(sDate4 + "\t" + date4);
        System.out.println(sDate5 + "\t" + date5);
        System.out.println(sDate6 + "\t" + date6);
    }
}

class Arrylist_Technolamror {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Rajendra");//Adding object in arraylist
        list.add("Mahendra");
        list.add("Raja");
        list.add("Technolamror");


        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class ListIteratorExample {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Java Program Questation", "Rajendra", "Technolamror", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to list


        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Original content of list is: ");
        //Traversing list
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        ListIterator<Book> itr = list.listIterator();
        System.out.println("Modified content of list in backward is: ");
        while (itr.hasNext()) {
            Book st = (Book) itr.next();
            System.out.println(st.quantity + " " + st.publisher + " " + st.author + " " + st.name + " " + st.id);
        }
    }
}

class TestCollection9 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi");
        set.add("Technolamror");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class LinkedHashSet_Technolamror {
    public static void main(String args[]) {
        LinkedHashSet<String> al = new LinkedHashSet<String>();

        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi");
        al.add("Technolamror");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {


        }
    }
}

class TreeSet_Technolamror {
    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi");
        al.add("Technolamror");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class PriorityQueue_Technolamror {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Rajendra");
        queue.add("Mahendra");
        queue.add("Raja");
        queue.add("Technolamror");
        queue.add("Rahul");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}

class MapInterfaceExample {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Rajendra");
        map.put(101, "Lamror");
        map.put(102, "Technolamror");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

class LinkedHashMap_Technolmaror {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Rajendra");
        hm.put(101, "Vijay");
        hm.put(102, "Technolamror");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

class TreeMap_Technolamror {
    public static void main(String args[]) {
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Technolamror");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}


class Hashtable_Technolamror {
    public static void main(String args[]) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Rajendra");
        hm.put(102, "Praveen");
        hm.put(101, "Bipin");
        hm.put(103, "Pankaj");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

class Array_Technolamror {
    public static void main(String args[]) {

        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

//printing array
        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);

    }
}

class Multi_Array {
    public static void main(String args[]) {

//declaring and initializing 2D array
        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

//printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

class Recursion_Technolamror {
    static int factorial(int n) {
        if (n == 1) return 1;
        else return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class Test2 {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}

class LinkedHashSet_Technolamror1{
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();

        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi");
        al.add("Technolamror");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){



        }
    }
}