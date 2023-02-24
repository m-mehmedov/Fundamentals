package OaC_E04_Students;

public class Student {
    private String firstName;
    private String secondName;
    private double grade;
    public Student(String firstName, String secondName, double grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public double getGrade() {
        return grade;
    }
}
