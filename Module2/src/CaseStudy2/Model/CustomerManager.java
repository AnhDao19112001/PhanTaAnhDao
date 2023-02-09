package CaseStudy2.Model;

public class CustomerManager extends Person{
    private int customerID;
    private String typeOfGuest;
    private String address;

    public CustomerManager() {
    }

    public CustomerManager(String name, String dayOfBirth, String gender, int idCardPerson,
                           String phoneNumber, String email, int customerID, String typeOfGuest, String address) {
        super(name, dayOfBirth, gender, idCardPerson, phoneNumber, email);
        this.customerID = customerID;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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
        return "CustomerManager{" + super.toString() +
                "customerID=" + customerID +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.customerID + COMMA + this.typeOfGuest + COMMA + this.address;
    }
}
