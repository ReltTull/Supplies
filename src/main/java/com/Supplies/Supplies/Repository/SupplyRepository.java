package com.Supplies.Supplies.Repository;

import com.Supplies.Supplies.Entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, String> {
}
