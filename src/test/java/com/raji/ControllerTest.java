package com.raji;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.raji.controller.MenuController;
import com.raji.model.Menu;
import com.raji.repository.MenuRepository;
import com.raji.service.MenuService;

@SpringBootTest


public class ControllerTest {
	
@Autowired

private MenuController controller;

@Autowired
MenuRepository menurepo;

	@Test
	void controller() {
		assertThat(controller).isNotNull();
	}
	@MockBean
	private MenuService service;
	@Test
	public void menuShouldReturnMessageFromService() {
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testReadAll() {
		List<Menu> list=menurepo.findAll();
		assertThat(list).size().isGreaterThan(0);
		
	}
}
