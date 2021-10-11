package W2HW2;
import java.util.*;
public class Course {

    // private variables defined
    private String courseName;
    private double courseScore;

    // empty constructor
//    public Course () {
//    }

    // Computer parameterized constructor
    public Course( String courseName, double courseScore) {
        this.courseName = courseName;
        this.courseScore = courseScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName( String courseName ) {
        this.courseName = courseName;
    }

    public double getCourseScore() {
        return courseScore;
    }

    public void setCourseScore( double courseScore ) {
        this.courseScore = courseScore;
    }

//    String courseName;
//    double courseScore;
//    int numCourses;
//
//
////    Course courseArray[courseName, courseScore] = new Course[numcourses];
////    private String courseName;
////    private double courseScore;
//
//    public Course () {
//    }
//
//    public Course ( String courseName, double courseScore) {
//    }
}
//
//
//    public void scanner() {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many courses this semester? ");
//        numCourses = input.nextInt();
//        Course[] courseArray = new Course[numCourses];
//
//        for (int i = 0 ; i < numCourses ; i++) {
//            System.out.println("Enter Course Name: ");
//            courseName = input.nextLine();
//
//            System.out.println("Enter Course Score: ");
//            courseScore = input.nextDouble();
//
//            courseArray[i] = new courseArray[courseName, courseScore];
//
//        }
//    }
//
////    public Course(String courseName) {
////    }
////
////    public Course(double courseScore) {
////    }
//
////    public static String getCourseName() {
////        return courseName;
////    }
////
////    public void setCourseName( String courseName ) {
////        Course.courseName = courseName;
////    }
////    public static double getCourseScore() {
////        return courseScore;
////    }
////    public void setCourseScore( double courseScore ) {
////        Course.courseScore = courseScore;
////    }
//}
