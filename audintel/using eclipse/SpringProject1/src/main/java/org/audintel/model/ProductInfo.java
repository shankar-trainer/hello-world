package org.audintel.model;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class ProductInfo {

	private List<String> bookList;
	private Set<String> carSet;
	private Map<Long,Product> prdMap;
	
	
}
