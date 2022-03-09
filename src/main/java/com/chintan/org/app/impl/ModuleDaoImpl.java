package com.chintan.org.app.impl;

import com.chintan.org.app.dao.ModuleDao;
import com.chintan.org.app.model.ModuleDetails;
import com.chintan.org.app.repository.InterviewEasyRepository;
import com.chintan.org.app.row.InterviewEasyRow;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.chintan.org.app.row.InterviewEasyRow.aInterviewEasyRowBuilder;

@Component
public class ModuleDaoImpl implements ModuleDao {

    @Autowired
    private InterviewEasyRepository interviewEasyRepository;

    @Override
    public String addModules(ModuleDetails row) {
        InterviewEasyRow interviewEasyRow = aInterviewEasyRowBuilder()
                .id(row.getId())
                .module(row.getModule())
                .build();
        System.out.println(interviewEasyRepository.save(interviewEasyRow));
        return "Success";
    }

    @Override
    public List<InterviewEasyRow> getModules() {
        List<InterviewEasyRow> list = new ArrayList<>();
        Lists.newArrayList(interviewEasyRepository.findAll().iterator())
                .forEach(x->list.add(x));
        return list;
    }
}
