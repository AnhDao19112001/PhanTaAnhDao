package CaseStudy2.Model;

public class RoomManager extends FacilityManager{
    private String freeService;

    public RoomManager() {
    }

    public RoomManager(int facilityID, String name, String area, Double costs, int amounts, String rentalType, String freeService) {
        super(facilityID, name, area, costs, amounts, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "RoomManager{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.freeService;
    }
}
