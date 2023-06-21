import java.util.regex.*;
import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import java.io.*;


class TestJoinMethod1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}

class Multi extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Multi t1 = new Multi();
        t1.start();
    }
}
class RegexExample1{
    public static void main(String args[]){
//1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
//2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();
//3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b+" "+b2+" "+b3);
    }}

 class Proc {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
                CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");
        stmt.setInt(1,1011);
        stmt.setString(2,"Amit");
        stmt.execute();
        System.out.println("success");
    }
}

 class InsertImage {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");



            ps.setString(1,"Technolamror");
            FileInputStream fin=new FileInputStream("d:\\g.jpg");
            ps.setBinaryStream(2,fin,fin.available());
            int i=ps.executeUpdate();
            System.out.println(i+" records affected");
            con.close();
        }catch (Exception e) {e.printStackTrace();}
    }
}
class InsertPrepared{
    public static void main(String args[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
                    PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");
            stmt.setInt(1,101);//1 specifies the first parameter in the query
            stmt.setString(2,"Ratan");
            int i=stmt.executeUpdate();
            System.out.println(i+" records inserted");
            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
}
class OracleCon{
    public static void main(String args[]){
        try{
//step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
//step2 create the connection object



            Connection
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
//step3 create the statement object
                    Statement stmt=con.createStatement();
//step4 execute query
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//step5 close the connection object
            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
}
class BubbleSort {
    public static void main(String []args) {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of integers to sort");
        n = in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " integers");
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        for (c = 0; c < ( n - 1 ); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d+1]) /* For descending order use < */
                {
                    swap = array[d];
                    array[d] = array[d+1];
                    array[d+1] = swap;
                }
            }
        }
        System.out.println("Sorted list of numbers");
        for (c = 0; c < n; c++)
            System.out.println(array[c]);
    }
}
class LinearSearch1
{
    public static void main(String args[])
    {
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
        for (c = 0; c < n; c++)
        {
            if (array[c] == search) /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (c + 1) +
                        ".");
                break;
            }



        }
        if (c == n) /* Searching element is absent */
            System.out.println(search + " is not present in array.");
    }
}

  /*class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("---------------");
        }
    }

    public void searchBook(String keyword) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                matchingBooks.add(book);
            }
        }

        if (matchingBooks.isEmpty()) {
            System.out.println("No matching books found.");
            return;
        }

        System.out.println("Matching Books:");
        for (Book book : matchingBooks) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("---------------");
        }
    }
}

 class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding sample books
        library.addBook(new Book(1, "Java Programming", "John Smith"));
        library.addBook(new Book(2, "Python Basics", "Jane Doe"));
        library.addBook(new Book(3, "Data Structures", "Robert Johnson"));

        while (true) {
            System.out.println("1. Display all books");
            System.out.println("2. Search a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    scanner.nextLine(); // Clear the newline character
                    System.out.print("Enter a keyword to search: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
    }
}

   */
