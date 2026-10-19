package com.example.app1.book;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record BookRequest(
		@NotBlank(message = "title is required")
		@Size(max = 255)
		String title,

		@NotBlank(message = "author is required")
		@Size(max = 255)
		String author,

		@Size(max = 32)
		String isbn,

		@Min(value = 1000, message = "publishedYear must be a 4-digit year")
		@Max(value = 9999, message = "publishedYear must be a 4-digit year")
		Integer publishedYear
) {
}
