package com.example.app1.book;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Transactional(readOnly = true)
	public List<BookResponse> findAll() {
		return bookRepository.findAll().stream().map(BookResponse::from).toList();
	}

	@Transactional(readOnly = true)
	public BookResponse findById(Long id) {
		return BookResponse.from(getBook(id));
	}

	public BookResponse create(BookRequest request) {
		assertIsbnAvailable(request.isbn(), null);
		Book book = new Book(request.title(), request.author(), blankToNull(request.isbn()), request.publishedYear());
		return BookResponse.from(bookRepository.save(book));
	}

	public BookResponse update(Long id, BookRequest request) {
		Book book = getBook(id);
		assertIsbnAvailable(request.isbn(), id);
		book.setTitle(request.title());
		book.setAuthor(request.author());
		book.setIsbn(blankToNull(request.isbn()));
		book.setPublishedYear(request.publishedYear());
		return BookResponse.from(bookRepository.save(book));
	}

	public void delete(Long id) {
		if (!bookRepository.existsById(id)) {
			throw new ResourceNotFoundException("Book not found: " + id);
		}
		bookRepository.deleteById(id);
	}

	private Book getBook(Long id) {
		return bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not found: " + id));
	}

	private void assertIsbnAvailable(String isbn, Long currentId) {
		if (!StringUtils.hasText(isbn)) {
			return;
		}
		boolean duplicate = currentId == null
				? bookRepository.existsByIsbn(isbn)
				: bookRepository.existsByIsbnAndIdNot(isbn, currentId);
		if (duplicate) {
			throw new DuplicateIsbnException(isbn);
		}
	}

	private static String blankToNull(String value) {
		return StringUtils.hasText(value) ? value : null;
	}
}
