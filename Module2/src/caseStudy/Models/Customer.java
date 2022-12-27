package caseStudy.Models;

public class Customer {
    private String customerType;
    private String address;

    public Customer() {
        super();
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String customerType, String address) {
        super();
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getName(),
                this.getDateOfBirth(),
                this.getGender(),
                this.getIdCard(),
                this.getPhone(),
                this.getEmail(),
                this.getCustomerType(),
                this.getAddress());
    }

    public Object getId() {
        return null;
    }

    @Override
    public String toString() {
        return "KHÁCH HÀNG - " + super.toString() +
                ", Loại khách hàng: " + getCustomerType() +
                ", Địa chỉ: " + getAddress();
    }
}
