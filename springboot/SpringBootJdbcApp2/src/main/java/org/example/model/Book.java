package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by shankar on 4/19/2023.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
 private int isbn;
 private  String  name;
 private  String  author;
 private float cost;

}
