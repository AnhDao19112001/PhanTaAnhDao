package CaseStudy_3.Model;

public class Villa extends Facility{
    private String room;
    private String poolArea;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String name, String area, String costs, String amount, String rentalType, String room, String poolArea, String numberOfFloors) {
        super(id, name, area, costs, amount, rentalType);
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
        return "Villa{" +
                "room='" + getRoom() + '\'' +
                ", poolArea='" + getPoolArea() + '\'' +
                ", numberOfFloors='" + getNumberOfFloors() + '\'' +
                '}';
    }
}
