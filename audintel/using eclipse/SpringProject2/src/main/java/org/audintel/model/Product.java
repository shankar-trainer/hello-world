package org.audintel.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {
	private long prdId;
	private  String prdName;
	private float prdCost;
	private LocalDate prdMfd;
}
