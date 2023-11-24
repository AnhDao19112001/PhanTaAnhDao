package service;


import model.SieuThi;

import java.util.List;

public interface ISieuThiService {
    List<SieuThi> findAll();
    void save(SieuThi sieuThi);
    void delete(Integer id);
}
