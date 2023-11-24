package service;

import model.CongViec;

import java.util.List;

public interface ICongViecService {
    List<CongViec> findAll();
    void save(CongViec congViec);
    void delete(Integer id);
}
