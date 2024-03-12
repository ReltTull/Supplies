package com.Supplies.Supplies.Controller;

import com.Supplies.Supplies.Entity.Supply;
import com.Supplies.Supplies.Service.SupplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/supplies")
public class SupplyController {

    /**
     * Adding new record on the database
     */
    @Autowired
    SupplyService service;
    @PostMapping("/addSupply")
    public Supply addSupply(@RequestBody Supply supply) {
        log.info("Новая запись в таблицу поставок: " + supply.getId());
        return service.saveRecord(supply);
    }

    @GetMapping("/all")
    public List<Supply> getSupplies() {
        return service.getAllRecords();
    }

    @GetMapping(value = "/id", produces = MediaType.TEXT_PLAIN_VALUE)
    public Supply getSupplyById(@PathVariable String id) {
        return service.getSupplyBuId(id);
    }

    @DeleteMapping("/deleteSupply/{id}")
    public String deleteSupply(@PathVariable String id) {
        service.deleteById(id);
        return "Record " + id + " has been deleted";
    }
}
