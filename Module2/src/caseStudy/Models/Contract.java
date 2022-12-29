package caseStudy.Models;

public class Contract {
    private String numberContract;
    private String bookingId;
    private String depositMoney;
    private String sumMoney;
    private String customerId;

    public Contract(String numberContract, String bookingId, int depositMoney, int sumMoney, String customerId) {
    }

    public Contract(String numberContract, String bookingId, String depositMoney, String sumMoney, String customerId) {
        this.numberContract = numberContract;
        this.bookingId = bookingId;
        this.depositMoney = depositMoney;
        this.sumMoney = sumMoney;
        this.customerId = customerId;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(String sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
//    public String getInfo() {
//        return String.format("%s,%s,%s,%s,%s\n",
//                this.getNumberContract(),
//                this.getBookingId(),
//                this.getDepositMoney(),
//                this.getSumMoney(),
//                this.getCustomerId());

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract='" + getNumberContract() + '\'' +
                ", bookingId='" + getBookingId() + '\'' +
                ", depositMoney='" + getDepositMoney() + '\'' +
                ", sumMoney='" + getSumMoney() + '\'' +
                ", customerId='" + getCustomerId() + '\'' +
                '}';
    }

    public char[] getInfo() {
        return this.getInfo();
    }
}
