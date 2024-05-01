import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 

class StudentName implements Comparable<StudentName>{
    public String name;
    public int age;
     
    public StudentName(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    public String toString() {
        return "StudentName [name=" + name + ", age=" + age + "]";
    }
   
    public int compareTo(StudentName that) {
       
        if(this.age > that.age)
                    return 1;
                else
                    return -1;

    }
    
}


public class SorTing {
    public static void main(String args[]){
        List <StudentName> names = new ArrayList<>();
        names.add(new StudentName("Ade", 34));
        names.add(new StudentName("Me",55));
        names.add(new StudentName("Femi", 45));
        names.add(new StudentName("Adetola",23));

        Comparator<StudentName> comp = ( i, j) -> i.age > j.age ? 1 : -1;      

        Collections.sort(names, comp);       
        for (StudentName studentName : names) {
            System.out.println(studentName);
        }

        List<String> sort = new ArrayList<>();
        sort.add("our");
        sort.add("in");
        sort.add("right");
        sort.add("class");

        Comparator<String> sortMe = new Comparator<String>() {
            public int compareTo(StudentName i , StudentName j){
                return i.length() - j.length();
            }
        };
    }
}
    
        
 


