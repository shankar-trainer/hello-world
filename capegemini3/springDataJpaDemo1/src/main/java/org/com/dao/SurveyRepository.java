package org.com.dao;

import org.com.model.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository  extends CrudRepository<Survey, Integer>{

}
