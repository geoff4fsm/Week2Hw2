package W2HW2;

import java.util.Scanner;

public class Employee extends Person implements PersonInterface {


    int empNum = 1000;
    String jobTitle;
    String hireDate;
    double empSalary, bonus, hours;


    Employee() {
        empNum++;
    }

    Employee(String fName, String lName, int age, char gender, int empNum, String jobTitle, String hireDate, double empSalary) {

        super(fName, lName, age, gender);

        this.empNum = empNum;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
        this.empSalary = empSalary;
        empNum++;
    }
public void scanner() {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter employee first name: ");
        input.nextLine();
		fName = input.nextLine();

		System.out.println("Enter employee last name: ");
		lName = input.nextLine();

		System.out.println("Enter employee age: ");
		age = input.nextInt();

		System.out.println("Enter employee gender: ");
		gender = input.next().charAt(0);

		System.out.println("Enter employee street: ");
        input.nextLine();
		street = input.nextLine();

		System.out.println("Enter employee city: ");
		city = input.nextLine();

		System.out.println("Enter employee state: ");
		state = input.nextLine();

		System.out.println("Enter employee zip: ");
		zipcode = input.nextInt();

        System.out.println("Enter employee Salary: ");
        empSalary = input.nextDouble();
}
    public void display() {
        super.display();
        System.out.println("Employee Number: " + this.empNum);
        System.out.println("Employee Salary " + this.empSalary);
        System.out.println(calculate(10));
        System.out.println(compute(7, 15));
    }
    //	@Override
    public double calculate(int num) {
        bonus = empSalary / num;
        return bonus;
    }

    //	@Override
    public double compute(int num1, int num2) {
        hours = num2 - num1;
        return hours;
    }


}

