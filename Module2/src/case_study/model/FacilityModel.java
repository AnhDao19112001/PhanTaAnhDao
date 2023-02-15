package case_study.Model;

public abstract class FacilityModel {
    private String id;
    private String name;
    private double area;
    private double costs;
    private String amount;
    private String rentalType;

    protected FacilityModel() {
    }

    protected FacilityModel(String id, String name,
                         double area, double costs,
                         String amount, String rentalType) {
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
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
        return "FacilityModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", costs=" + costs +
                ", amount='" + amount + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.id + COMMA + this.name + COMMA + this.area + COMMA + this.costs + COMMA + this.amount + COMMA + this.rentalType;
    }
}
