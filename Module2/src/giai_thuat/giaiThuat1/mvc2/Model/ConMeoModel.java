package giai_thuat.giaiThuat1.mvc2.Model;

public class ConMeoModel extends DongVatModel{
    private String DiChuyen;

    public ConMeoModel() {
    }

    public ConMeoModel(String diChuyen) {
        DiChuyen = diChuyen;
    }

    public ConMeoModel(String ten, String mauLong, String canNang, String diChuyen) {
        super(ten, mauLong, canNang);
        DiChuyen = diChuyen;
    }

    public String getDiChuyen() {
        return DiChuyen;
    }

    public void setDiChuyen(String diChuyen) {
        DiChuyen = diChuyen;
    }

    @Override
    public String toString() {
        return "ConMeoModel{" +
                "DiChuyen='" + DiChuyen + '\'' +
                '}';
    }
}
