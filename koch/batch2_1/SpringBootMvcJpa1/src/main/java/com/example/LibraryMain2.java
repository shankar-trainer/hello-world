package com.example;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Library;
import com.example.service.LibraryService;

@SpringBootApplication
public class LibraryMain2 {
	
		public static void main(String[] args) {
			SpringApplication.run(LibraryMain2.class, args);
		}
}
