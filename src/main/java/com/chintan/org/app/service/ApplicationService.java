package com.chintan.org.app.service;

import com.chintan.org.app.dao.ModuleDao;
import com.chintan.org.app.model.ModuleDetails;
import com.chintan.org.app.row.InterviewEasyRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    ModuleDao moduleDao;

    public ApplicationService(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
    }

    public String addModules(ModuleDetails moduleDetails){
        return moduleDao.addModules(moduleDetails);
    }

    public List<InterviewEasyRow> getModules(){
        return moduleDao.getModules();
    }
}
