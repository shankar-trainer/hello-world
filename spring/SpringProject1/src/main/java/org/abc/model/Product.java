package org.abc.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by shankar on 4/12/2023.
 */
@Data
public class Product {
    private int prdId;
    private String prdName;
    private int prdCost;

    private Order order1;
    private List<String> bookList;
    private Set<String> movieList;
    private Map<Integer, String> bikeCollection;


}
