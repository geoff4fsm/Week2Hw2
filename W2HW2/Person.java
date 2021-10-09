package W2HW2;


public class Person  {

    String fName, lName, street, city, state;
    int age, zipcode;
    char gender;


    public Person() {
    }

    public Person(String fName, String lName, int age, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("First Name: " + this.fName);
        System.out.println("Last Name: " + this.lName);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("Street Address: " + this.street);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zip Code: " + this.zipcode);
    }
}

