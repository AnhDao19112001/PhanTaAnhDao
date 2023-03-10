package case_study.model;

public class BookingModel {
    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerCode;
    private String serviceName;

    public BookingModel() {
    }

    public BookingModel(String bookingId, String startDay,
                        String endDay, String customerCode, String serviceName) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "BookingModel{" +
                "bookingId='" + bookingId + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.bookingId + COMMA + this.startDay + COMMA + this.endDay + COMMA + this.customerCode + COMMA + this.serviceName;
    }
}
