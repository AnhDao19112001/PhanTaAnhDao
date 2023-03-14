package CaseStudy_3.Model;

public class Customer extends Person{
    private String customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dOB, String gender, String idCard, String phoneNumber, String email, String customerCode, String typeOfGuest, String address) {
        super(name, dOB, gender, idCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + getCustomerCode() + '\'' +
                ", typeOfGuest='" + getTypeOfGuest() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
