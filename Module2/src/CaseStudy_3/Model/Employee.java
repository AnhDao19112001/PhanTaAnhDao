package CaseStudy_3.Model;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private String wage;

    public Employee() {
    }

    public Employee(String name, String dOB, String gender, String idCard, String phoneNumber, String email, String employeeCode, String level, String position, String wage) {
        super(name, dOB, gender, idCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
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

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + getEmployeeCode() + '\'' +
                ", level='" + getLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", wage='" + getWage() + '\'' +
                '}';
    }
}
