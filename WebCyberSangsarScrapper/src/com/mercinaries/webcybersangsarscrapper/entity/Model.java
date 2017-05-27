package com.mercinaries.webcybersangsarscrapper.entity;

public class Model {

	private int numb;
	
	private String name,id;
	
	public Model() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id2) {
		this.id = id2;
	}

	public String getname() {
		return name;
	}

	public void setname(String firstName) {
		this.name = firstName;
	}

	

	public int getNumb() {
		return numb;
	}

	public void setNumb(int i) {
		this.numb = i;
	}

	@Override
	public String toString() {
		return " Number=" + numb + "		id=" + id + "		name=" + name + "\r\n\r\n";
	}
	
}
