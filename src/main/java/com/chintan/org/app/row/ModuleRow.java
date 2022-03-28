package com.chintan.org.app.row;

import javax.persistence.*;

@Entity(name = "MODULE")
public class ModuleRow {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private String moduleName;

    public ModuleRow() {

    }

    public ModuleRow(ModuleRowBuilder builder) {
        this.id = builder.id;
        this.categoryName = builder.categoryName;
        this.moduleName = builder.moduleName;
    }

    public Integer getId() {
        return id;
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
        private Integer id;
        private String categoryName;
        private String moduleName;

        public ModuleRowBuilder id(Integer id) {
            this.id = id;
            return this;
        }

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
