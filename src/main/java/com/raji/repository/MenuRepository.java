package com.raji.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raji.model.Menu;

@Repository
public interface MenuRepository extends MongoRepository<Menu,String> {

	

}
