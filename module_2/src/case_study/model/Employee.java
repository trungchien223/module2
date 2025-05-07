package case_study.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender,
                    String idCard, String phone, String email,
                    String level, String position, double salary) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary
                ;
    }

}
