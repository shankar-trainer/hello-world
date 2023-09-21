package com.example.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Product {
	private int prdId;
	private String prdName;

}
