package caseStudy.Models;

import java.util.Objects;

public class Booking {
    public char[] getInfo;
    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerId;
    private String serviceId;
    private String serviceName;

    public Booking() {
    }

    public Booking(String bookingId, String startDay, String endDay, String customerId, String serviceId, String serviceName) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceId = serviceId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + getBookingId() + '\'' +
                ", startDay='" + getStartDay() + '\'' +
                ", endDay='" + getEndDay() + '\'' +
                ", customerId='" + getCustomerId() + '\'' +
                ", serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId.equals(booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }


//    @Override
//    public int compareTo(Booking o) {
//        return this.bookingId.compareTo(o.bookingId);
//    }
}
