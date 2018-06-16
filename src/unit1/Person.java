package unit1;



public class Person {
    private String FirstName;
    private String SecondName;
    private String LastName;

    Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
