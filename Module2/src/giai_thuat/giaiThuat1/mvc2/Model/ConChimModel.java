package giai_thuat.giaiThuat1.mvc2.Model;

public class ConChimModel extends DongVatModel{
    private String Bay;

    public ConChimModel() {
    }

    public ConChimModel(String bay) {
        Bay = bay;
    }

    public ConChimModel(String ten, String mauLong, String canNang, String bay) {
        super(ten, mauLong, canNang);
        Bay = bay;
    }

    public String getBay() {
        return Bay;
    }

    public void setBay(String bay) {
        Bay = bay;
    }

    @Override
    public String toString() {
        return "ConChimModel{" +
                "Bay='" + Bay + '\'' +
                '}';
    }
}
