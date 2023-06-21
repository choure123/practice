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
class StudentGenericDemo {
    public static void main(String[] args) {
        GenericStudent<String , String , Integer , Integer> s1 = new GenericStudent<String , String , Integer , Integer>("Arpit", "Sahu",  001, 211111111);
        System.out.println(s1.getFirstname());
    }
}
class GenericStudent<FirstName ,LastName ,RollNo, PhoneNumber>{
    private final FirstName f;
    private final LastName l;
    private final RollNo r;
    private final PhoneNumber p;
    GenericStudent(FirstName f , LastName l , RollNo r , PhoneNumber p){
        this.f = f;
        this.l = l;
        this.r = r;
        this.p = p;
    }

    public FirstName getFirstname() {
        return f;
    }

    public LastName getLastname() {
        return l;
    }

    public PhoneNumber getPHoneNumber() {
        return p;
    }

    public RollNo getRollno() {
        return r;
    }
}
//We generally don't use generic classes

 class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;
        float f = 10.0f;
        double d = 10.0;
        long l = 10000000;
        short s = 12;
        boolean b = true;
        char c  = 'a';
        byte by = 10;

        //boxing : The procees of converting the raw data to its respective object
        Integer intObj = i;
        Float floatObj = f;
        Double doubleObj = d;
        Long longObj = l;
        Short shortObj = s;
        Boolean booleanObj = b;
        Character charObj = c;
        Byte byteObj = by;



        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(longObj);
        System.out.println(shortObj);
        System.out.println(booleanObj);
        System.out.println(charObj);
        System.out.println(byteObj);

        //unboxing : Converting object data to raw data
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        long lv = longObj;
        short sv = shortObj;
        boolean bv = booleanObj;
        char cv = charObj;
        byte byv = byteObj;

        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(lv);
        System.out.println(sv);
        System.out.println(bv);
        System.out.println(cv);
        System.out.println(byv);

    }
}
