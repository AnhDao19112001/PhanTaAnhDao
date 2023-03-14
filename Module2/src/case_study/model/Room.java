package case_study.model;

public class Room extends FacilityModel{
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, double area,
                double costs, String amount,
                String rentalType, String freeService) {
        super(id, name, area, costs, amount, rentalType);
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
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.freeService;
    }
}
