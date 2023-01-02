package caseStudy.Models;

public class Employee extends Person {
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

    public Employee(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
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




    @Override
    public String toString() {
        return "Employee{" +
                "level='" + getLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public char[] getInfo() {
        return new char[0];

    }

}
