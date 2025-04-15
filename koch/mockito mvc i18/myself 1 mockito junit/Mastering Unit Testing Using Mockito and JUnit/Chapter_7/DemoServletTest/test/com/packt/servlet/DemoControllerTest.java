package com.packt.servlet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

	@Mock
	HttpServletRequest req;
	@Mock
	HttpServletResponse res;
	@Mock
	RequestDispatcher dispatcher;
	
	DemoController controllerServlet;
	
	@Before
	public void setup() {
		controllerServlet = new DemoController();
		when(req.getRequestDispatcher(anyString())).thenReturn(dispatcher);
	}
	
	@Test
	public void when_servlet_path_is_empty_then_opens_login_page() throws Exception {
		when(req.getServletPath()).thenReturn("/");
		
		controllerServlet.doGet(req, res);
		
		ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
		verify(req).getRequestDispatcher(dispatcherArgument.capture());
		assertEquals("login.jsp", dispatcherArgument.getValue());
	}
	
	@Test
	public void when_home_page_request_then_opens_home_page() throws Exception {
		when(req.getServletPath()).thenReturn("/home.do");
		
		controllerServlet.doGet(req, res);
		
		ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
		verify(req).getRequestDispatcher(dispatcherArgument.capture());
		assertEquals("home.jsp", dispatcherArgument.getValue());
	}
	
	@Test
	public void when_invalid_request_then_opens_error_page() throws Exception {
		when(req.getServletPath()).thenReturn("/xyz.do");
		
		controllerServlet.doGet(req, res);
		
		ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
		verify(req).getRequestDispatcher(dispatcherArgument.capture());
		assertEquals("error.jsp", dispatcherArgument.getValue());
	}
}
