package W2HW2;

//import W2HW2.Person;
//import W2HW2.PersonInterface;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {

        Student stud = new Student();
        Employee emp = new Employee();
        Person1 per = new Person1();

        stud.scanner();
        stud.display();
        emp.scanner();
        emp.display();
        per.scanner();
        per.display();
    }

}

