package W2HW2;

public class Student extends Person implements PersonInterface{


    int studNum = 1000;
    String studMajor;
    double subject1, subject2, subject3;

    Student(){
        studNum++;
    }

    Student( String fName, String lName, int age, char gender, int studNum, String studMajor, double subject1, double subject2, double subject3 ) {

        super(fName, lName, age, gender);

        this.studNum = studNum;
        this.studMajor = studMajor;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        studNum++;
    }

    public void display() {
        super.display();
        System.out.println("Student Number " + this.studNum);
        System.out.println("Student Major " + this.studMajor);
        System.out.println("Subject One Score " + this.subject1);
        System.out.println("Subject Two Score " + this.subject2);
        System.out.println("Subject Three Score " + this.subject3);
        System.out.println(calculate(3));
        System.out.println(compute(3, 4));
    }

    //	@Override
    public double calculate(int totalSubjects) {
        double average = ((this.subject1 + this.subject2 + this.subject3)/totalSubjects);
        return average;

    }

    //	@Override
    public double compute(int totalSubjects, int creditHours) {
        double credits = totalSubjects * creditHours;
        return credits;
    }

}
