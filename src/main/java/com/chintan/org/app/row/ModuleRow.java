package com.chintan.org.app.row;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "MODULE")
public class ModuleRow implements Serializable {

    @Id
    private String moduleName;

    @Column(nullable = false)
    private String categoryName;

    public ModuleRow() {

    }

    public ModuleRow(ModuleRowBuilder builder) {
        this.categoryName = builder.categoryName;
        this.moduleName = builder.moduleName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public static ModuleRowBuilder aModuleRowBuilder() {
        return new ModuleRowBuilder();
    }

    public static class ModuleRowBuilder {
        private String categoryName;
        private String moduleName;

        public ModuleRowBuilder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public ModuleRowBuilder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public ModuleRow build() {
            return new ModuleRow(this);
        }
    }

}
