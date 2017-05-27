package com.mercinaries.webcybersangsarscrapper.dao;

import java.util.List;

import com.mercinaries.webcybersangsarscrapper.entity.Model;


public interface ModelDAO{
	String insert (Model c);
	List<Model> getAll();
	Model getById(String id);
	Model getByNumb(int id);
	
}
