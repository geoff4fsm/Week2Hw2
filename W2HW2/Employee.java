package W2HW2;
import java.util.Scanner;

public class Employee extends Person implements PersonInterface {


    int empNum = 1000, empBonus, vacDays, sickDays, daysOff;
    String jobTitle;
    String hireDate;
    double empSalary, bonus, hours;


    Employee() {
        empNum++;
    }

    Employee(String fName, String lName, int age, char gender, int empNum, String jobTitle, String hireDate, double empSalary, int vacDays, int sickDays) {

        super(fName, lName, age, gender);

        this.empNum = empNum;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
        this.empSalary = empSalary;
        this.vacDays = vacDays;
        this.sickDays = sickDays;
        empNum++;
    }
public void scanner() {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter employee first name: ");
		fName = input.nextLine();

		System.out.println("Enter employee last name: ");
		lName = input.nextLine();

		System.out.println("Enter employee age: ");
		age = input.nextInt();

		System.out.println("Enter employee gender: ");
		gender = input.next().charAt(0);
            while (!(gender=='m') && !(gender=='f') && !(gender=='t')) {
                System.out.println("m,f or t only please try again");
                gender = input.next().charAt(0);
            }
		System.out.println("Enter employee street: ");
        input.nextLine();
		street = input.nextLine();

		System.out.println("Enter employee city: ");
		city = input.nextLine();

		System.out.println("Enter employee state: ");
		state = input.nextLine();

		System.out.println("Enter employee zip: ");
		zipcode = input.nextInt();

        System.out.println("Enter employee hire date: ");
        input.nextLine();
        hireDate = input.nextLine();

        System.out.println("Enter employee job title: ");
        jobTitle = input.nextLine();

        System.out.println("Enter employee Salary: ");
        empSalary = input.nextDouble();

        System.out.println("End of year bonus % ");
        empBonus = input.nextInt();

        System.out.println("Enter number of vacation days: ");
        vacDays = input.nextInt();

        System.out.println("Enter number of sick days: ");
        sickDays = input.nextInt();
}
    public void display() {
        super.display();
        System.out.println("Employee Number: " + this.empNum);
        System.out.println("Employee Salary " + this.empSalary);
        System.out.println("Employee Job Title: " + this.jobTitle);
        System.out.println("Employee Hire Date " + this.hireDate);
        System.out.println("End of year bonus = " + calculate(empBonus));
        System.out.println(compute(7, 15));
    }
    //	@Override
    public double calculate(int num) {
        bonus = empSalary / empBonus;
        return bonus;
    }

    //	@Override
    public double compute(int num1, int num2) {
        daysOff = vacDays + sickDays;
        return daysOff;
    }


}

