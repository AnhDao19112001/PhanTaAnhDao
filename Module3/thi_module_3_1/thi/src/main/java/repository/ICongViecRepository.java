package repository;

import model.CongViec;

import java.util.List;

public interface ICongViecRepository {
    List<CongViec> findAll();
    void save(CongViec congViec);
    void delete(Integer id);
}
