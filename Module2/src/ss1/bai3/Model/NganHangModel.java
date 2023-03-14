package ss1.bai3.Model;

public class NganHangModel {
    private String id;
    private String tenKhachHang;
    private String maKhachHang;
    private String maSoTietKiem;
    private String soTien;
    private String kyHan;
    private String laiSuat;

    public NganHangModel() {
    }

    public NganHangModel(String maSoTietKiem, String soTien, String kyHan, String laiSuat, String maKhachHang, String id, String tenKhachHang) {
        this.maSoTietKiem = maSoTietKiem;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.maKhachHang = maKhachHang;
        this.id = id;
        this.tenKhachHang = tenKhachHang;
    }

    public NganHangModel(NganHangModel nganHangModel) {
    }

    public String getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "NganHangModel{" +
                "maSoTietKiem='" + maSoTietKiem + '\'' +
                ", soTien='" + soTien + '\'' +
                ", kyHan='" + kyHan + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", id='" + id + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.id+COMMA+this.maKhachHang+COMMA+this.maSoTietKiem+COMMA+this.soTien+COMMA+this.laiSuat+COMMA+this.tenKhachHang+COMMA+this.kyHan;
    }
}
