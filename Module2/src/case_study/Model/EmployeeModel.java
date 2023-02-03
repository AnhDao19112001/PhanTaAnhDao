package case_study.Model;

public class EmployeeModel extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private double wage;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String dOB, String gender, String idCard, String phoneNumber, String email, String employeeCode, String level, String position, double wage) {
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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String convertLine(){
        String COMMA = ",";
        return this.employeeCode + COMMA + this.level + COMMA + this.position + COMMA + this.wage;
    }
}
