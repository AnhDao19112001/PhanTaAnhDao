package service;


import model.SieuThi;
import repository.ISieuThiRepository;
import repository.SieuThiRepository;

import java.sql.SQLException;
import java.util.List;

public class SieuThiService implements ISieuThiService {
    private ISieuThiRepository iSieuThiRepository = new SieuThiRepository();
    @Override
    public List<SieuThi> findAll() {
        return iSieuThiRepository.findAll();
    }

    @Override
    public void save(SieuThi sieuThi) {
        iSieuThiRepository.save(sieuThi);
    }

    @Override
    public void delete(Integer id) {
        iSieuThiRepository.delete(id);
    }
}
