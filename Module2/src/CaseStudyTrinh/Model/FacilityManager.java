package CaseStudyTrinh.Model;

public abstract class FacilityManager {
    private int facilityID;
    private String name;
    private String area;
    private Double costs;
    private int amounts;
    private String rentalType;

    public FacilityManager() {
    }

    public FacilityManager(int facilityID, String name, String area, Double costs, int amounts, String rentalType) {
        this.facilityID = facilityID;
        this.name = name;
        this.area = area;
        this.costs = costs;
        this.amounts = amounts;
        this.rentalType = rentalType;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
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

    public Double getCosts() {
        return costs;
    }

    public void setCosts(Double costs) {
        this.costs = costs;
    }

    public int getAmounts() {
        return amounts;
    }

    public void setAmounts(int amounts) {
        this.amounts = amounts;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "FacilityManager{" +
                "facilityID=" + facilityID +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", costs=" + costs +
                ", amounts=" + amounts +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.facilityID + COMMA + this.name + COMMA + this.area + COMMA + this.costs + COMMA + this.amounts + COMMA + this.rentalType;
    }
}
