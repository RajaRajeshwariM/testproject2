package com.raji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raji.model.Menu;
import com.raji.service.MenuService;
@RestController
public class MenuController {
	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "/saveitem", method = RequestMethod.POST)
	public Menu saveitem(@RequestBody Menu item)

	{
		try {
			menuService.SaveMenu(item);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return item;
	}
	@GetMapping (value="/all")
	public List<Menu> getAllMenu(){
		return menuService.getAll();
		
	}
}
