package com.chintan.org.app.repository;

import com.chintan.org.app.row.ModuleRow;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends CrudRepository<ModuleRow, Integer> {
    @Query("SELECT e from MODULE e where e.categoryName =:categoryName")
    List<ModuleRow> findModulesForCategories(@Param("categoryName") String categoryName);

}
