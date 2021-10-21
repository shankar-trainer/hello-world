package cts.com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
///country//find/feignData/{id}
	static Map<String, String> countryMap;
	static {

		countryMap = new TreeMap<String, String>();
		countryMap.put("in", "Inida");
		countryMap.put("ch", "China");
		countryMap.put("sr", "SriLanka");
		countryMap.put("ne", "nepal");
		countryMap.put("bd", "BanglaDesh");
	}

	@GetMapping("/all")
	public List<String> getAllCountry() {

		List<String> l1 = new ArrayList<String>();

		for (String key : countryMap.keySet()) {
			l1.add(countryMap.get(key));
		}
		return l1;
	}

	@GetMapping("/find/feignData/{id}")
	public String findCountry(@PathVariable("id") String id) {

		for (String key : countryMap.keySet()) {
			if (key.equals(id))
				return countryMap.get(key);
		}
		return null;
	}
}
