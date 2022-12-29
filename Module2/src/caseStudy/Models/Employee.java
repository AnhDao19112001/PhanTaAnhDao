package caseStudy.Models;

public class Employee extends Person{
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String level, String position, int salary) {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public String getInfo() {
//        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
//                this.getId(),
//                this.getName(),
//                this.getDateOfBirth(),
//                this.getGender(),
//                this.getIdCard(),
//                this.getPhone(),
//                this.getEmail(),
//                this.getLevel(),
//                this.getPosition(),
//                this.getSalary());

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + getLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

//    public char[] getInfo() {
//        return this.getInfo();
//    }
//
//    public String getIdCard() {
//        return this.getIdCard();
//    }
//
//    public void setDateOfBirth(String dateFormat) {
//    }
//
//    public void setGender(String gender) {
//    }
//
//    public void setId(String upperCaseName) {
//    }
//
//    public void setIdCard(String idCard) {
//    }
//
//    public void setPhone(String phone) {
//    }
//
//    public void setEmail(String email) {
//    }
//
//    public String getId() {
//        return this.getId();
//    }
}
