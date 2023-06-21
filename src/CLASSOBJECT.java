import java.util.Scanner;

class Employee{
    int id;
    String name;
    float sel;
    Scanner s2;

    public Employee(Scanner s1){
        s2=s1;
    }
    public void setEmp(){
        System.out.println("enter id :-");
        id=s2.nextInt();
        System.out.println(" enter name :-");
        name=s2.nextLine();
        System.out.println("enter selary:-");
        sel=s2.nextFloat();

        }
        public void display() {
            System.out.println("id=" + id);
            System.out.println("name=" + name);
            System.out.println("selary=" + sel);
        }

    public void setEmpl() {
    }
}

public class CLASSOBJECT {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        Employee obj=new Employee(s1);
        obj.setEmpl();
        obj.display();

    }
}
