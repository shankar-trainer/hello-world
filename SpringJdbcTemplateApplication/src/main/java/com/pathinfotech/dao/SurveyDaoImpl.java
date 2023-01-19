package com.pathinfotech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pathinfotech.model.Survey;

public class SurveyDaoImpl implements SurveyDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addSurvey(Survey survey) {
		if (searchSurvey(survey.getSurveyId()) == null) {
			jdbcTemplate.update("insert into survey values(" + survey.getSurveyId() + ",'" + survey.getSurveyName()
					+ "','" + survey.getSurveyLocation() + "')");
			return true;
		}
		return false;
	}

	@Override
	public List<Survey> getAllSurvey() {
		return jdbcTemplate.query("select * from survey", new RowMapper<Survey>() {

			@Override
			public Survey mapRow(ResultSet rs, int rowNum) throws SQLException {
				Survey survey = new Survey();
				survey.setSurveyId(rs.getInt(1));
				survey.setSurveyName(rs.getString(2));
				survey.setSurveyLocation(rs.getString(3));
				return survey;

			}

		});
	}

	Survey survey;

	public Survey searchSurvey(int surveyId) {

		survey = null;
		try {
			survey= jdbcTemplate.queryForObject("select * from survey where surveyId=?",
					new Object[] { surveyId }, new RowMapper<Survey>() {

						@Override
						public Survey mapRow(ResultSet rs, int rowNum) throws SQLException {
							Survey survey = new Survey();

							survey.setSurveyId(rs.getInt(1));
							survey.setSurveyName(rs.getString(2));
							survey.setSurveyLocation(rs.getString(3));
							return survey;
						}

					});
		} catch (org.springframework.dao.EmptyResultDataAccessException e) {
			System.err.println(e);
		}
		return survey;
	}
}
