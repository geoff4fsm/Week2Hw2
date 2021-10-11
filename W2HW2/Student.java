package W2HW2;
import java.util.ArrayList;
import java.util.Scanner;
public class Student extends Person /*implements PersonInterface*/ {


    int studNum = 1000, numCourses;
    String studMajor, courseName;
    double subject1, subject2, subject3 , courseScore;



//    Course[] courseArray = new W2HW2.Course[numCourses] ;
//    private Object Course;


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

    public void scanner() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        fName = input.nextLine();

        System.out.println("Enter student last name: ");
        lName = input.nextLine();

        System.out.println("Enter student age: ");
        age = input.nextInt();

        System.out.println("Enter student gender: ");
        gender = input.next().charAt(0);

        while (!(gender=='m') && !(gender=='f') && !(gender=='t')) {
            System.out.println("m,f or t only please try again");
            gender = input.next().charAt(0);
        }
        System.out.println("Enter student street: ");
        input.nextLine();
        street = input.nextLine();

        System.out.println("Enter student city: ");
        city = input.nextLine();

        System.out.println("Enter student state: ");
        state = input.nextLine();

        System.out.println("Enter student zip: ");
        zipcode = input.nextInt();

        System.out.println("Enter student major: ");
        input.nextLine();
        studMajor = input.nextLine();

//        System.out.println("How many courses this semester? ");
//        numCourses = input.nextInt();
//
//        ArrayList<Course> courseList = new ArrayList<>();
//        for (int i = 0 ; i < numCourses ; i++) {
////            course[i] = new Course[i];
//
//            System.out.println("Enter Course Name: ");
//            input.nextLine();
//            courseName = input.nextLine();
////            courseList.add(new Course(courseName));
//
//            System.out.println("Enter Course Score: ");
////            input.nextDouble();
//            courseScore = input.nextDouble();
////            courseScore[i]=(courseScore);
//            courseList.add(new Course(courseName, courseScore));
//            System.out.println(courseList);
////            System.out.println(Course);
////            courseList = new Course();
//        }
//
    }
//    Course CourseObject = new Course();

    public void display() {
        super.display();
        System.out.println("Student Number " + this.studNum);
        System.out.println("Student Major " + this.studMajor);

 //       W2HW2.Course[] courses;


//        for (int i = 0 ; i < numCourses ; i++ ) {
//            System.out.println("inside for loop");
//            System.out.println(" Course " + this.courseName[i]);
//            System.out.println(" Score " + Course[i].courseScore());
//        }
//        System.out.println(calculate(numCourses));
////        System.out.println(compute(3, 4));
//
    }

    //	@Override
//    public double calculate(int totalSubjects) {
//        double average = ((this.subject1 + this.subject2 + this.subject3)/totalSubjects);
//        return average;
//
//    }

    //	@Override
//    public double compute(int totalSubjects, int creditHours) {
//        double credits = totalSubjects * creditHours;
//        return credits;
//    }

}