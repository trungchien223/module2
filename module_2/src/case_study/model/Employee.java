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

    public String toStringCSV() {
        return super.toStringCSV() + "," + level + "," + position + "," + salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static Employee fromString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 10) {
            try {
                double salary = Double.parseDouble(parts[9]);
                return new Employee(
                        parts[0], parts[1], parts[2], parts[3], parts[4],
                        parts[5], parts[6], parts[7], parts[8], salary
                );
            } catch (NumberFormatException e) {
                System.err.println("Lỗi định dạng lương: " + parts[9]);
            }
        }
        return null;
    }

}
