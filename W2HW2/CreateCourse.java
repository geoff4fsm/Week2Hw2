package W2HW2;
import java.util.*;

public class CreateCourse extends Student implements PersonInterface{

    int numCourses = 0;
    String courseName = null;
    double courseScore = 0, total = 0;

    public void scanner() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many courses this semester? ");
        numCourses = input.nextInt();
        Course[] courseArray = new Course[numCourses];

        for (int i = 0 ; i < numCourses ; i++) {

            courseArray[i] = new Course(courseName, courseScore);

            System.out.println("Enter Course Name: ");
            input.nextLine();
            courseName = input.nextLine();
            courseArray[i].setCourseName(courseName);

            System.out.println("Enter Course Score: ");
            courseScore = input.nextDouble();
            courseArray[i].setCourseScore(courseScore);
            total = total + courseScore;
        }
        for (int i = 0 ; i < numCourses ; i++) {
            System.out.println("Course Name: " + courseArray[i].getCourseName());
            System.out.println("Course Score: " + courseArray[i].getCourseScore());
        }
        System.out.println(calculate(numCourses));
        System.out.println(compute(numCourses, 4));
    }

//    public void display() {
//        for (int i = 0 ; i < numCourses ; i++ ) {
//            Course[] courseArray = new Course[0];
//            System.out.println("Course Name: " + courseArray[i].getCourseName());
//            System.out.println("Course Score: " + courseArray[i].getCourseScore());
//        }
//        System.out.println(calculate(numCourses));
//    }
    public double calculate(int numCourses) {

        double average = total/numCourses;
        return average;

    }
        public double compute(int numCourses, int creditHours) {
        double credits = numCourses * creditHours;
        return credits;
    }
}
