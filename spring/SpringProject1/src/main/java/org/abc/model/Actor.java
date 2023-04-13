package org.abc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component
public class Actor {
    private int actorId;
    private String actorName;
    private int actorAge;
}
