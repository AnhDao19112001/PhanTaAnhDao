package CaseStudyTrinh.Model;

public class VillaManager extends FacilityManager{
    private String room;
    private String poolArea;
    private String numberOfFloors;

    public VillaManager() {
    }

    public VillaManager(int facilityID, String name, String area, Double costs, int amounts, String rentalType, String room, String poolArea, String numberOfFloors) {
        super(facilityID, name, area, costs, amounts, rentalType);
        this.room = room;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "VillaManager{" + super.toString() +
                "room='" + room + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.room + COMMA + this.poolArea + COMMA + this.numberOfFloors;
    }
}
