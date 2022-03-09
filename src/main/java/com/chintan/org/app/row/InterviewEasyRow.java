package com.chintan.org.app.row;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="INTERVIEW_EASY")
public class InterviewEasyRow {

    @Id
    private int id;
    private String module;

    public InterviewEasyRow() {

    }

    public InterviewEasyRow(InterviewEasyRowBuilder builder) {
        this.id = builder.id;
        this.module = builder.module;
    }

    public int getId() {
        return id;
    }

    public String getModule() {
        return module;
    }

    public static InterviewEasyRowBuilder aInterviewEasyRowBuilder() {
        return new InterviewEasyRowBuilder();
    }

    public static class InterviewEasyRowBuilder {
        private int id;
        private String module;

        public InterviewEasyRowBuilder id(int id) {
            this.id = id;
            return this;
        }

        public InterviewEasyRowBuilder module(String module) {
            this.module = module;
            return this;
        }

        public InterviewEasyRow build() {
            return new InterviewEasyRow(this);
        }
    }

}
