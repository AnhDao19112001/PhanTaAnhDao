package caseStudy.Models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceId, String serviceName, Double areaUse, int rentalCosts, int maxNumberOfPeople, String renTalType, String freeServiceIncluded) {
        super(serviceId, serviceName, areaUse, rentalCosts, maxNumberOfPeople, renTalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

//    public String getInfo() {
//        return String.format("%s,%s,%s,%s,%s,%s,%s",
//                this.getServiceId(),
//                this.getServiceName(),
//                this.getAreaUse(),
//                this.getRentalCosts(),
//                this.getMaxNumberOfPeople(),
//                this.getRentalType(),
//                this.getFreeServiceIncluded());

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + getFreeServiceIncluded() + '\'' +
                '}';
    }
}
