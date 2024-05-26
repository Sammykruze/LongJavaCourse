 public class Student {
    int rollNum;
    String name;
    int marks;
}

 class Demi{
    public static void main(String []args){

        Student student = new Student();

        student.rollNum = 1;
        student.name = "Abiola";
        student.marks = 56;

        Student student1 = new Student();
        student1.rollNum = 1;
        student1.name = "Bidemi";
        student1.marks = 78;

        Student student2 = new Student();
        student2.rollNum = 1;
        student2.name = "Babajide";
        student2.marks = 90;

        Student stud[] = new Student[3];
        stud[0] = student;
        stud[1] = student1;
        stud[2] = student2;

        for (Student allStudent : stud) {
            System.out.println(allStudent.name + " :" + allStudent.marks);
        }
        
    }
}
