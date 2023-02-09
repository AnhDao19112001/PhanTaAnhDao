package CaseStudy2.Model;

public class BookingManager {
    private String bookingID;
    private String startDay;
    private String endDay;
    private String customerID;
    private String serviceName;

    public BookingManager() {
    }

    public BookingManager(String bookingID, String startDay, String endDay, String customerID, String serviceName) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceName = serviceName;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "BookingManager{" +
                "bookingID='" + bookingID + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerID='" + customerID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
