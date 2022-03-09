package com.chintan.org.app.repository;

import com.chintan.org.app.row.InterviewEasyRow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewEasyRepository extends CrudRepository<InterviewEasyRow, Integer> {

}
