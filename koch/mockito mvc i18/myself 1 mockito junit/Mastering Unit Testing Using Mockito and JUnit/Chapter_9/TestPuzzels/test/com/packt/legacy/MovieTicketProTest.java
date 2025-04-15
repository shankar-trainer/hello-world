package com.packt.legacy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MovieTicketProTest {
	@Mock ErrorMessageDisplayer messageDisplayer;
	@Mock MovieDao movieDao;
	

	MovieTicketPro movieTicketPro = new MovieTicketPro() {
		protected ErrorMessageDisplayer getErrorMessageDisplayer() {
			return messageDisplayer;
		}
		
		protected MovieDao getMovieDao() {
			return movieDao;
		}
	};

	@Test
	public void when_invalid_movie_shows_error_message() throws Exception {
		movieTicketPro.book(null, null, 1);
		ArgumentCaptor<String> stringArgCaptor = ArgumentCaptor
				.forClass(String.class);
		ArgumentCaptor<Integer> intArgCaptor = ArgumentCaptor
				.forClass(Integer.class);

		verify(messageDisplayer).showMessage(stringArgCaptor.capture(),
				stringArgCaptor.capture(), intArgCaptor.capture());
		assertEquals("Movie or showtime not available", stringArgCaptor.getAllValues().get(1));
	}

}
