package caseStudy.Models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, double areaUse, int rentalCosts, int maxNumberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceId,
                serviceName,
                areaUse,
                rentalCosts,
                maxNumberOfPeople,
                rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

//    public String getInfo() {
//        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
//                this.getServiceId(),
//                this.getServiceName(),
//                this.getAreaUse(),
//                this.getRentalCosts(),
//                this.getMaxNumberOfPeople(),
//                this.getRentalType(),
//                this.getRoomStandard(),
//                this.getPoolArea(),
//                this.getNumberOfFloors());
    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + getRoomStandard() + '\'' +
                ", poolArea=" + getPoolArea() +
                ", numberOfFloors=" + getNumberOfFloors() +
                '}';
    }
}
