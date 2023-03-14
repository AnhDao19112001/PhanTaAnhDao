package ss16.bai_tap.read;

public class Nation {
    private int id;
    private String code;
    private String name;

    public Nation() {
    }

    public Nation(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Nation.csv{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", code='" + getCode() + '\'' +
                '}';
    }
}
