package caseStudy.Models;

public class Link {
    PATH_CUSTOMER("src\caseStudy\data\customer.csv"),
    PATH_EMPLOYEE("src\caseStudy\data\employee.csv"),
    PATH_VILLA("src\caseStudy\data\villa.csv"),
    PATH_ROOM("src\caseStudy\data\room.csv"),
    PATH_BOOKING("src\caseStudy\data\booking.csv"),
    PATH_CONTRACT("src\caseStudy\data\contract.csv");

    private final String path;

    Link(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
