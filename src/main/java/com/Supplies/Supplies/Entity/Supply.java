package com.Supplies.Supplies.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supply")
public class Supply {
    @Id
    @Column(name = "id_supply")
    private String id;

    @Column(name = "auto_number")
    private String autoNumber;

    @Column(name = "consignee")
    private String consignee;

    @Column(name = "custom")
    private String custom;

    @Column(name = "storage_warehouse")
    private String storageWarehouse;
}
