package com.raji.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data

@Document("menu")
public class Menu {
		@Id
		String id;
		private String itemName;
		private String category;
		private Integer price;
		private Integer discount;
		
}