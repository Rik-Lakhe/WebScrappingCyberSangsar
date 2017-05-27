package com.mercinaries.webcybersangsarscrapper.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mercinaries.webcybersangsarscrapper.dao.ModelDAO;
import com.mercinaries.webcybersangsarscrapper.entity.Model;

public class ModelDAOImpl implements ModelDAO {
	Scanner input = new Scanner(System.in);
	private List<Model> modelList = new ArrayList<>();

	@Override
	public String insert(Model c) {
		modelList.add(c);
		return null;
	}

	@Override
	public List<Model> getAll() {
		return modelList;
	}

	@Override
	public Model getById(String id) {
		for (Model cu : modelList) {
			if (id == cu.getId()) {
				return cu;

			}

		}
		return null;
	}

	@Override
	public Model getByNumb(int id) {
		for (Model cu : modelList) {
			if (id == cu.getNumb()) {
				return cu;

			}

		}
		return null;

	}
}