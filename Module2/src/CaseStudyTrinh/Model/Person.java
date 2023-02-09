package CaseStudyTrinh.Model;

public abstract class Person {
    private String name;
    private String dayOfBirth;
    private String gender;
    private int idCardPerson;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String gender, int idCardPerson, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCardPerson = idCardPerson;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCardPerson() {
        return idCardPerson;
    }

    public void setIdCardPerson(int idCardPerson) {
        this.idCardPerson = idCardPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCardPerson=" + idCardPerson +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.name + COMMA + this.dayOfBirth + COMMA + this.gender + COMMA + this.idCardPerson + COMMA + this.phoneNumber + COMMA + this.email;
    }
}
