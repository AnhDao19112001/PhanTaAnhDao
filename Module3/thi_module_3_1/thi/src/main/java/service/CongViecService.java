package service;

import model.CongViec;
import repository.CongViecRepository;
import repository.ICongViecRepository;

import java.util.List;

public class CongViecService implements ICongViecService{
    private ICongViecRepository iCongViecRepository = new CongViecRepository();
    @Override
    public List<CongViec> findAll() {
        return iCongViecRepository.findAll();
    }

    @Override
    public void save(CongViec congViec) {
        iCongViecRepository.save(congViec);
    }

    @Override
    public void delete(Integer id) {
        iCongViecRepository.delete(id);
    }
}
