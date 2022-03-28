package com.chintan.org.app.repository;

import com.chintan.org.app.row.ModuleRow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CrudRepository<ModuleRow, Integer> {
}
