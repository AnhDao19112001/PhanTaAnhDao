package caseStudy.Models;

public class Facility {
    private String serviceId;
    private String serviceName;
    private Double areaUse;
    private int rentalCosts;
    private int maxNumberOfPeople;
    private String renTalType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, Double areaUse, int rentalCosts, int maxNumberOfPeople, String renTalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.renTalType = renTalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(Double areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRenTalType() {
        return renTalType;
    }

    public void setRenTalType(String renTalType) {
        this.renTalType = renTalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", rentalCosts=" + rentalCosts +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", renTalType='" + renTalType + '\'' +
                '}';
    }
}
