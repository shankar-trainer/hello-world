package com.packt.tdd.survey;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SurveyResultCompilerTest {

	SurveyResultCompiler surveyResultCompiler;
	
	@Before
	public void setUp() {
		surveyResultCompiler = new SurveyResultCompiler();
	}
	@Test
	public void when_one_opinion_then_result_forecasts_the_opinion() {
		surveyResultCompiler.willVoteFor("Party A");
		Map<String, BigDecimal> result =surveyResultCompiler.forecastResult();
		assertEquals(new BigDecimal("100"), result.get("Party A"));
	}
	
	@Test
	public void when_two_different_opinions_then_forecasts_50_percent_chance_for_each_party() {
		surveyResultCompiler.willVoteFor("Party A");
		surveyResultCompiler.willVoteFor("Party B");
		
		Map<String, BigDecimal> result =surveyResultCompiler.forecastResult();
		
		assertEquals(new BigDecimal("50"), result.get("Party A"));
		assertEquals(new BigDecimal("50"), result.get("Party B"));
	}
	
	@Test
	public void when_three_different_opinions_then_forecasts_33_percent_chance_for_each_party() {
		surveyResultCompiler.willVoteFor("Party A");
		surveyResultCompiler.willVoteFor("Party B");
		surveyResultCompiler.willVoteFor("Party C");
		
		Map<String, BigDecimal> result =surveyResultCompiler.forecastResult();
		
		assertEquals(new BigDecimal("33"), result.get("Party A"));
		assertEquals(new BigDecimal("33"), result.get("Party B"));
		assertEquals(new BigDecimal("33"), result.get("Party C"));
	}
}
