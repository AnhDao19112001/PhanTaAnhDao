package model;

public class CongViec {
    private Integer id;
    private String name;
    private String NTH;
    private String NKT;
    private TrangThai trangThai;
    private String moTa;

    public CongViec() {
    }

    public CongViec(Integer id, String name, String NTH, String NKT, TrangThai trangThai, String moTa) {
        this.id = id;
        this.name = name;
        this.NTH = NTH;
        this.NKT = NKT;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNTH() {
        return NTH;
    }

    public void setNTH(String NTH) {
        this.NTH = NTH;
    }

    public String getNKT() {
        return NKT;
    }

    public void setNKT(String NKT) {
        this.NKT = NKT;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
