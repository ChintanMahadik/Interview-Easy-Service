package com.chintan.org.app.impl;

import com.chintan.org.app.dao.ModuleDao;
import com.chintan.org.app.model.Module;
import com.chintan.org.app.repository.ModuleRepository;
import com.chintan.org.app.row.ModuleRow;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModuleDaoImpl implements ModuleDao {

    @Autowired
    private ModuleRepository moduleRepository;

    @Override
    public String addModule(Module module) {
        ModuleRow moduleRow = ModuleRow.aModuleRowBuilder()
                .categoryName(module.getCategoryName().orElse(null))
                .moduleName(module.getModuleName().orElse(null))
                .build();
        try {
            moduleRepository.save(moduleRow);
            return "Success";
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Failure";
        }
    }

    @Override
    public List<ModuleRow> getModules(String categoryName) {
        List<ModuleRow> list = new ArrayList<>();
        Lists.newArrayList(moduleRepository.findModulesForCategories(categoryName).iterator())
                .forEach(x -> list.add(x));
        return list;
    }
}
