package spring.com;

public class Student {

    private int studentId;
    private String name;
    private String city;
    private String email;

    // Dependency
    private Department department;

    // Default Constructor
    public Student() {
        super();
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Department

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", name=" + name +
                ", city=" + city +
                ", email=" + email +
                ", department=" + department + "]";
    }
}