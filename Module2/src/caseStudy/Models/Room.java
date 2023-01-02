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



    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + getFreeServiceIncluded() + '\'' +
                '}';
    }
}
