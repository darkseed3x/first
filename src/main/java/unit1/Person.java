package unit1;



public class Person {
    private String FirstName;
    private String SecondName;
    private String LastName;

    Person(){}

    public Person(String firstName, String secondName, String lastName) {
        FirstName = firstName;
        SecondName = secondName;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
