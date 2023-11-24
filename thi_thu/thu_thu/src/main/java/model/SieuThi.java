package model;

public class SieuThi {
    private Integer id;
    private String name;
    private Integer NSX;
    private Integer HSD;
    private LoaiThucPham loaiThucPham;
    private String moTa;

    public SieuThi() {
    }

    public SieuThi(Integer id, String name, Integer NSX, Integer HSD, LoaiThucPham loaiThucPham, String moTa) {
        this.id = id;
        this.name = name;
        this.NSX = NSX;
        this.HSD = HSD;
        this.loaiThucPham = loaiThucPham;
        this.moTa = moTa;
    }

    public SieuThi(String name, Integer NSX, Integer HSD, LoaiThucPham loaiThucPham, String moTa) {
        this.name = name;
        this.NSX = NSX;
        this.HSD = HSD;
        this.loaiThucPham = loaiThucPham;
        this.moTa = moTa;
    }

    public SieuThi(Integer id, String name, Integer NSX, Integer HSD, String moTa) {
        this.id = id;
        this.name = name;
        this.NSX = NSX;
        this.HSD = HSD;
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

    public Integer getNSX() {
        return NSX;
    }

    public void setNSX(Integer NSX) {
        this.NSX = NSX;
    }

    public Integer getHSD() {
        return HSD;
    }

    public void setHSD(Integer HSD) {
        this.HSD = HSD;
    }

    public LoaiThucPham getLoaiThucPham() {
        return loaiThucPham;
    }

    public void setLoaiThucPham(LoaiThucPham loaiThucPham) {
        this.loaiThucPham = loaiThucPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
