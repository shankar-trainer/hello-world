package com.packt.tdd.survey;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SurveyResultCompiler {
	private Map<String, Integer> opinions = new HashMap<String, Integer>();
	private long participationCount = 0;

	public void willVoteFor(String opinion) {
		Integer sameOpinionCount = opinions.get(opinion);
		if (sameOpinionCount == null) {
			sameOpinionCount = 1;
		} else {
			sameOpinionCount++;
		}
		opinions.put(opinion, sameOpinionCount);
		participationCount++;
	}

	public Map<String, BigDecimal> forecastResult() {
		Map<String, BigDecimal> result = new HashMap<String, BigDecimal>();

		for (String opinion : opinions.keySet()) {
			Integer sameOpinionCount = opinions.get(opinion);
			BigDecimal opinionPercentage = new BigDecimal(
					(sameOpinionCount * 100) / participationCount);
			result.put(opinion, opinionPercentage);
		}

		return result;
	}

}
