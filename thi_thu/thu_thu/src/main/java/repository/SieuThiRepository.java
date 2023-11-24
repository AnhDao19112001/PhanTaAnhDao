package repository;

import model.LoaiThucPham;
import model.SieuThi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SieuThiRepository implements ISieuThiRepository {

    @Override
    public List<SieuThi> findAll(){
        Connection connection = BaseRepository.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<SieuThi> sieuThiList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement("select * from thuc_pham" +
                        " join loai_thuc_pham ltp on ltp.id_ltp = thuc_pham.id_ltp" +
                        " order by thuc_pham.id;");

                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    Integer NSX = resultSet.getInt("NSX");
                    Integer HSD = resultSet.getInt("HSD");
                    Integer idLTP = resultSet.getInt("idLTP.id_ltp");
                    String nameLTP = resultSet.getString("nameLTP.id_ltp");
                    LoaiThucPham loaiThucPham = new LoaiThucPham(idLTP, nameLTP);
                    String moTa = resultSet.getString("moTa");
                    SieuThi sieuThi = new SieuThi(id,name,NSX,HSD,loaiThucPham,moTa);
                    sieuThiList.add(sieuThi);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return sieuThiList;
    }

    @Override
    public void save(SieuThi sieuThi) {

    }

    @Override
    public void delete(Integer id) {

    }
}
