package giai_thuat.giaiThuat1;

public class bai8_cleanCode {
    public int sum(int firstNum, int secondNum, int thirdNum) {
        int sum = firstNum + secondNum + thirdNum;
        return sum;
    }

    private void employeeDetails(String name, String age, String awards, String ctc, String experience) {

    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}
