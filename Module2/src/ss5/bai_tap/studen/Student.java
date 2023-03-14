package ss5.bai_tap.studen;

public class Student {
    private String name = "Jonh";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return String.format("name: %s, class: %s", getName(), getClasses());
    }
}
