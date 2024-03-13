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

    /**
     * Обновляет данные по поставке, замещая новой записью с тем же id, но новыми данными, старую запись
     * @param supply
     * @return
     */
    public Supply updateSupplyDetails(Supply supply) {
        Supply updatedSupply = supplyRepository.findById(supply.getId()).orElse(null);
        if (updatedSupply != null) {
            updatedSupply.setId(supply.getId());
            updatedSupply.setAutoNumber(supply.getAutoNumber());
            updatedSupply.setConsignee(supply.getConsignee());
            updatedSupply.setCustom(supply.getCustom());
            supplyRepository.save(updatedSupply);
            return updatedSupply;
        }
        return null;
    }


    /**
     * Выводит все записи
     * @return
     */
    public List<Supply> getAllRecords () {
        return supplyRepository.findAll();
    }

    /**
     * Выводит запись по id
     * @param id
     * @return
     */
    public Supply getSupplyBuId(String id) {
        return supplyRepository.getReferenceById(id);
    }

    /**
     * Удаляет запись по id
     * @param id
     */
    public void deleteById(String id) {
        supplyRepository.deleteById(id);
    }
}
