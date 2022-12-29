package caseStudy.Models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }


    public Customer(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
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

    //    public String getInfo(){
//        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\\n",
//                this.getId(),
//                this.getId(),
//                this.getName(),
//                this.getDateOfBirth(),
//                this.getGender(),
//                this.getIdCard(),
//                this.getPhone(),
//                this.getEmail(),
//                this.getCustomerType(),
//                this.getAddress());
//
//        )
//    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "customerType='" + getCustomerType() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
//
//    public char[] getInfo() {
//        return this.getInfo();
//    }
//
//    public String getId() {
//        return this.getId();
//    }
//
//    public void getIdCard() {
//        this.getIdCard();
//    }
}

