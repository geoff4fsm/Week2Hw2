package W2HW2;
import java.util.Scanner;
public class Person1 extends Person {

    private long ssn;
    private long phone;

public Person1() {

}

public Person1( String fName, String lName, int age, char gender, long ssn, long phone) {

    super(fName, lName, age, gender);

    this.ssn = ssn;
    this.phone = phone;
}
public void scanner() {

    Scanner input = new Scanner(System.in);

            System.out.println("Enter person first name: ");
//        input.nextLine();
        fName = input.nextLine();

        System.out.println("Enter person last name: ");
        lName = input.nextLine();

        System.out.println("Enter person age: ");
        age = input.nextInt();

        System.out.println("Enter person gender: ");
        gender = input.next().charAt(0);

        System.out.println("Enter person street: ");
        input.nextLine();
        street = input.nextLine();

        System.out.println("Enter person city: ");
        city = input.nextLine();

        System.out.println("Enter person state: ");
        state = input.nextLine();

        System.out.println("Enter person zip: ");
        zipcode = input.nextInt();

        System.out.println("Enter person ssn: ");
        ssn = input.nextLong();

    System.out.println("Enter person phone: ");
    phone = input.nextLong();


}
    public long getSsn() {
        return ssn;
    }

    public void setSsn( long ssn ) {
        this.ssn = ssn;
    }
    public long getPhone() {
        return phone;
    }

    public void setPhone( long phone ) {
        this.phone = phone;
    }
    public void display() {
        super.display();
        System.out.println("ssn:" + this.ssn);
        System.out.println("phone:" + this.phone);
    }
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter person ssn: ");
//        ssn = input.nextInt();
//    }
}
//    public double calculate(int x) {
//
//        return 0;
//
//    }
//
//    public double compute(int y, int z) {
//        return 0;
//    }
