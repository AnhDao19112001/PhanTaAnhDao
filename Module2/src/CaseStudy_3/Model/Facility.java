package CaseStudy_3.Model;

public abstract class Facility {
    private String id;
    private String name;
    private String area;
    private String costs;
    private String amount;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id, String name, String area, String costs, String amount, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.costs = costs;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCosts() {
        return costs;
    }

    public void setCosts(String costs) {
        this.costs = costs;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", area='" + getArea() + '\'' +
                ", costs='" + getCosts() + '\'' +
                ", amount='" + getAmount() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                '}';
    }
}
