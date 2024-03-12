package com.Supplies.Supplies.Service;

import com.Supplies.Supplies.Entity.Supply;
import com.Supplies.Supplies.Repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {

    @Autowired
    private SupplyRepository supplyRepository;

    /**
     * Вносит новую запись в БД
     * @param supply
     * @return
     */
    public Supply saveRecord(Supply supply) {
        return supplyRepository.save(supply);
    }

    public List<Supply> getAllRecords () {
        return supplyRepository.findAll();
    }

    public Supply getSupplyBuId(String id) {
        return supplyRepository.getReferenceById(id);
    }

    public void deleteById(String id) {
        supplyRepository.deleteById(id);
        System.out.println("Supply " + id + " has been deleted");
    }
}
