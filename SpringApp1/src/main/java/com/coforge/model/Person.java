package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

//@Data= @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 

@Data
public class Person {
	private long id;
	private String name;
	private int age;
	
	private Set<String> bookSet;
	private List<String> musicAlbum;
	private Map<Integer,String> car;
}
