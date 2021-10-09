package W2HW2;

public class Employee extends Person implements PersonInterface{


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

