package com.raji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raji.model.Menu;
import com.raji.repository.MenuRepository;


@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public Menu SaveMenu(Menu item)
	{
		try
		{
		  menuRepository.save(item);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return item;
	}
	public List<Menu>getAll(){
		return  menuRepository.findAll();
		
	}}