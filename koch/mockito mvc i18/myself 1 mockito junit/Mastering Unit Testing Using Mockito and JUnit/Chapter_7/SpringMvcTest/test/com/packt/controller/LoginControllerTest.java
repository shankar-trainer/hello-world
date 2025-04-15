package com.packt.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.packt.model.LoginInfo;

public class LoginControllerTest {

	LoginController controller = new LoginController();
	LoginInfo loginInfo = null;
	ModelMap model = null;

	@Before
	public void setup() {
		loginInfo = new LoginInfo();
		model = new ModelMap();
	}

	@Test
	public void when_no_name_entered_shows_error_message() throws Exception {
		ModelMap model = new ModelMap();
		String viewName = controller.onLogin(new LoginInfo(), model);
		assertEquals("login", viewName);
		assertEquals("invalid login name", model.get("error"));
	}

	@Test
	public void when_invalid_password_entered_shows_error_message() {
		ModelMap model = new ModelMap();
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setUserId("junit");
		String viewName = controller.onLogin(loginInfo, model);
		assertEquals("login", viewName);
		assertEquals("invalid password", model.get("error"));
	}

	@Test
	public void happyPath() {
		loginInfo.setUserId("junit");
		loginInfo.setPassword("password");
		String viewName = controller.onLogin(loginInfo, model);
		assertEquals("greetings", viewName);
	}
}
