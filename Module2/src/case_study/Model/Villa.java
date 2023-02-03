package case_study.Model;

public class Villa extends FacilityModel{
    private String room;
    private double poolArea;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String name,
                 double area, double costs,
                 String amount, String rentalType,
                 String room, double poolArea, String numberOfFloors) {
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
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
                "room='" + room + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.room + COMMA + this.poolArea + COMMA + this.numberOfFloors;
    }
}
