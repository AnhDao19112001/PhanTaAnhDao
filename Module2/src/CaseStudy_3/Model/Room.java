package CaseStudy_3.Model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, String area, String costs, String amount, String rentalType, String freeService) {
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
        return "Room{" +
                "freeService='" + getFreeService() + '\'' +
                '}';
    }
}
