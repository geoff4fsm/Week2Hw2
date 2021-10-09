package W2HW2;

//import W2HW2.Person;
//import W2HW2.PersonInterface;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Employee emp1 = new Employee();
        Person1 per1 = new Person1();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        stud1.fName = input.nextLine();

        System.out.println("Enter student last name: ");
        stud1.lName = input.nextLine();

        System.out.println("Enter student age: ");
        stud1.age = input.nextInt();

        System.out.println("Enter student gender: ");
        stud1.gender = input.next().charAt(0);

        System.out.println("Enter student street: ");
        input.nextLine();
        stud1.street = input.nextLine();

        System.out.println("Enter student city: ");
        stud1.city = input.nextLine();

        System.out.println("Enter student state: ");
        stud1.state = input.nextLine();

        System.out.println("Enter student zip: ");
        stud1.zipcode = input.nextInt();

        System.out.println("Enter student major: ");
        input.nextLine();
        stud1.studMajor = input.nextLine();

		System.out.println("Enter student subject1 score: ");
		stud1.subject1 = input.nextDouble();

		System.out.println("Enter student subject2 score: ");
		stud1.subject2 = input.nextDouble();

		System.out.println("Enter student subject3 score: ");
		stud1.subject3 = input.nextDouble();

		System.out.println("Enter employee first name: ");
        input.nextLine();
		emp1.fName = input.nextLine();

		System.out.println("Enter employee last name: ");
		emp1.lName = input.nextLine();

		System.out.println("Enter employee age: ");
		emp1.age = input.nextInt();

		System.out.println("Enter employee gender: ");
		emp1.gender = input.next().charAt(0);

		System.out.println("Enter employee street: ");
        input.nextLine();
		emp1.street = input.nextLine();

		System.out.println("Enter employee city: ");
		emp1.city = input.nextLine();

		System.out.println("Enter employee state: ");
		emp1.state = input.nextLine();

		System.out.println("Enter employee zip: ");
		emp1.zipcode = input.nextInt();

        System.out.println("Enter employee Salary: ");
        emp1.empSalary = input.nextDouble();

        System.out.println("Enter person first name: ");
        input.nextLine();
        per1.fName = input.nextLine();

        System.out.println("Enter person last name: ");
        per1.lName = input.nextLine();

        System.out.println("Enter person age: ");
        per1.age = input.nextInt();

        System.out.println("Enter person gender: ");
        per1.gender = input.next().charAt(0);

        System.out.println("Enter person street: ");
        input.nextLine();
        per1.street = input.nextLine();

        System.out.println("Enter person city: ");
        per1.city = input.nextLine();

        System.out.println("Enter person state: ");
        per1.state = input.nextLine();

        System.out.println("Enter person zip: ");
        per1.zipcode = input.nextInt();

        System.out.println("Enter person ssn: ");
        per1.ssn = input.nextInt();

        stud1.display();
        emp1.display();
        per1.display();
    }

}

