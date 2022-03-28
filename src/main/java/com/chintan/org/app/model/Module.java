package com.chintan.org.app.model;

import java.util.Optional;

public class Module {
    private Optional<String> categoryName;
    private Optional<String> moduleName;

    public Module( Optional<String> categoryName, Optional<String> moduleName) {
        this.categoryName = categoryName;
        this.moduleName = moduleName;
    }

    public Optional<String> getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Optional<String> categoryName) {
        this.categoryName = categoryName;
    }

    public Optional<String> getModuleName() {
        return moduleName;
    }

    public void setModuleName(Optional<String> moduleName) {
        this.moduleName = moduleName;
    }
}
