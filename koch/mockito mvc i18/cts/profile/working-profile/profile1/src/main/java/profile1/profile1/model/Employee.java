package profile1.profile1.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data // for tostring getter, setter, @RequiredArgsConstructor

@AllArgsConstructor
// @ToString
// @Component
@JacksonXmlRootElement

public class Employee {

	@JacksonXmlProperty
	private int id;
	@JacksonXmlProperty
	private String name;

}
