package repository;

import model.CongViec;
import model.TrangThai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CongViecRepository implements ICongViecRepository{
    @Override
    public List<CongViec> findAll() {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<CongViec> congViecList = new ArrayList<>();

        if (connection != null){
            try {
                statement = connection.prepareStatement("select * from cong_viec join trang_thai th on th.id_tt = cong_viec.id_tt order by cong_viec.id_tt");
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("ten_cv");
                    String NTH = resultSet.getString("NTH");
                    String NKT = resultSet.getString("NKT");
                    int id_tt = resultSet.getInt("id_tt");
                    String ten_tt = resultSet.getString("ten_tt");
                    TrangThai trangThai = new TrangThai(id_tt, ten_tt);
                    String moTa = resultSet.getString("mo_ta");
                    CongViec congViec = new CongViec(id,name,NTH,NKT,trangThai,moTa);
                    congViecList.add(congViec);
            }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return congViecList;
    }

    @Override
    public void save(CongViec congViec) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement statement = null;
        if (connection !=null){
            try{
                statement = connection.prepareStatement("select * from cong_viec values (?,?,?,?,?,?)");
                statement.setInt(1,congViec.getId());
                statement.setString(2, congViec.getName());
                statement.setString(3, congViec.getNTH());
                statement.setString(4, congViec.getNKT());
                statement.setInt(5,congViec.getTrangThai().getId());
                statement.setString(6, congViec.getMoTa());
                statement.executeQuery();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void delete(Integer id) {

    }
}
