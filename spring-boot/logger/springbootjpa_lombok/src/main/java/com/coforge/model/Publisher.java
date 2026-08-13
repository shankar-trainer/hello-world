package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Publisher {
    @Id
    @GeneratedValue
    private UUID publisherId;
    private String publisherName;
    private String publisherLocation;
}
