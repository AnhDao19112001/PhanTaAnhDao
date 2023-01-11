package Module;

public class Teacher {
    private String name;
    private String age;
    private String adress;
    private String email;
    private String phoneNumber;
    private String classTeacher;
//contrustor
    public Teacher() {
    }

    public Teacher(String name, String age, String adress, String email, String phoneNumber, String classTeacher) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.classTeacher = classTeacher;
    }
//getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
// toString
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                '}';
    }
    // dùng cho file csv
    public String formatCSV() {
        return this.getName()+","+this.getAge()+","+this.getAdress()+","+
                this.getEmail()+","+this.getPhoneNumber()+","+this.getClassTeacher();
    }
}
