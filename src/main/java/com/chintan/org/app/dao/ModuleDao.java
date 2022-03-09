package com.chintan.org.app.dao;

import com.chintan.org.app.model.ModuleDetails;
import com.chintan.org.app.row.InterviewEasyRow;

import java.util.List;

public interface ModuleDao {
    public String addModules(ModuleDetails row);
    public List<InterviewEasyRow> getModules();
}
