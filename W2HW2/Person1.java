package W2HW2;

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
