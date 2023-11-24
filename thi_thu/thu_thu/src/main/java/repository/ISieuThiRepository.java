package repository;

import model.SieuThi;

import java.sql.SQLException;
import java.util.List;

public interface ISieuThiRepository {
    List<SieuThi> findAll();
    void save(SieuThi sieuThi);
    void delete(Integer id);
}
