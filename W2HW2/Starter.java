package W2HW2;

public class Starter {

    public static void main(String[] args) {

        Student stud = new Student();
        CreateCourse studCourse = new CreateCourse();
        Employee emp = new Employee();
        Person1 per = new Person1();

        stud.scanner();
        stud.display();
        studCourse.scanner();
        emp.scanner();
        emp.display();
        per.scanner();
        per.display();
//        studCourse.display();

    }

}

