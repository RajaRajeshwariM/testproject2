package com.raji;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.raji.controller.MenuController;
import com.raji.service.MenuService;

@WebMvcTest(MenuController.class)
public class WebMockTest {
	@Autowired
	private MockMvc mockmvc;
	@MockBean
	private MenuService service;
	@Test
	public void menuShouldReturnMessageFromService() {
		assertThat(service).isNotNull();
	}
	

}
