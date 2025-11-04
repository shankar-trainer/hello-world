package com.cts.controller;

import com.cts.dao.SurveyRepository;
import com.cts.model.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @PostMapping("/survey")
    public Survey addSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }
    @GetMapping("/survey")
    public List<Survey> getAllSurvey(@RequestBody Survey survey) {
        return surveyRepository.findAll();
    }
}
