package com.develdroiders.beans;

import java.io.Serializable;
import java.util.List;

public class Animals implements Serializable{
	
	private static final long serialVersionUID = 6530946531452367492L;
	
	private List<Animal> animals;

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

}
