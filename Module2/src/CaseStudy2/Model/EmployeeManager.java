package CaseStudy2.Model;

public class EmployeeManager extends Person{
    private int employeeID;
    private String level;
    private String position;
    private Double wage;

    public EmployeeManager() {
    }

    public EmployeeManager(String name, String dayOfBirth, String gender,
                           int idCardPerson, String phoneNumber, String email,
                           int employeeID, String level, String position, Double wage) {
        super(name, dayOfBirth, gender, idCardPerson, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" + super.toString() +
                "employeeID=" + employeeID +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA +this.employeeID + COMMA + this.level + COMMA + this.position + COMMA + this.wage;
    }
}
