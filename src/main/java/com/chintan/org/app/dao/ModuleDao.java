package com.chintan.org.app.dao;

import com.chintan.org.app.model.Module;
import com.chintan.org.app.row.ModuleRow;

import java.util.List;

public interface ModuleDao {
    public String addModule(Module row);
    public List<ModuleRow> getModules(String categoryName);
}
