package org.abc.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
//@Component
public class Movie {
    private int movieId;
    private String movieName;
    private double movieCost;

    @Autowired
    @Qualifier(value = "actor2")
    private Actor actor;

}
