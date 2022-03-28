package com.chintan.org.app.service;

import com.chintan.org.app.dao.ModuleDao;
import com.chintan.org.app.model.Module;
import com.chintan.org.app.row.ModuleRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    ModuleDao moduleDao;

    public ApplicationService(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
    }

    public String addModule(Module module){
        return moduleDao.addModule(module);
    }

    public List<ModuleRow> getModules(String categoryName){
        return moduleDao.getModules(categoryName);
    }
}
