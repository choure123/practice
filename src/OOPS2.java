import java.util.regex.*;
import java.util.Scanner;
import java.sql.*;

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
class LinearSearch
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