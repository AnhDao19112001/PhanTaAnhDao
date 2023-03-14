package giai_thuat.giaiThuat1.mvc2.Model;

public class DongVatModel {
    private String Ten;
    private String MauLong;
    private String CanNang;

    public DongVatModel() {
    }

    public DongVatModel(String ten, String mauLong, String canNang) {
        Ten = ten;
        MauLong = mauLong;
        CanNang = canNang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMauLong() {
        return MauLong;
    }

    public void setMauLong(String mauLong) {
        MauLong = mauLong;
    }

    public String getCanNang() {
        return CanNang;
    }

    public void setCanNang(String canNang) {
        CanNang = canNang;
    }

    @Override
    public String toString() {
        return "DongVatModel{" +
                "Ten='" + Ten + '\'' +
                ", MauLong='" + MauLong + '\'' +
                ", CanNang='" + CanNang + '\'' +
                '}';
    }

    public String formatCSV(){
        return this.getTen()+" , "+this.getMauLong()+" , "+this.getCanNang();
    }
}
