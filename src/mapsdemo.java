import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CustomStudent{
    String name;
    String branch;
    int rollNo;
    CustomStudent(String s1, String s2 , int i){
        this.name = s1;
        this.branch = s2;
        this.rollNo = i;
    }

    @Override
    public String toString() {
        return
                "name:'" + name + '\'' +
                        ", branch:'" + branch + '\''
                ;
    }
}
public class mapsdemo {


        public static void main(String[] args) {
            CustomStudent s1 = new CustomStudent("Kuldeep", "CSE", 1);
            CustomStudent s2 = new CustomStudent("komal", "civil", 2);
            CustomStudent s3 = new CustomStudent("Sumit","Mech",3);

            HashMap<Integer,CustomStudent> list1 = new HashMap<>();
            list1.put(s1.rollNo, s1);
            list1.put(s2.rollNo, s2);
            list1.put(s3.rollNo, s3);
            System.out.println(list1);
            list1.remove(s2.rollNo);
            System.out.println(list1);

        }
    }

