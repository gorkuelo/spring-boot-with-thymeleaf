package com.develdroiders.beans;

import java.io.Serializable;

import com.develdroiders.enums.TypeAnimalsEnum;

public class Animal implements Serializable{
	
	private static final long serialVersionUID = 2284083446634785298L;

	private TypeAnimalsEnum typeAnimal;
	
	private String name;
	
	private Double weight;
	
	private Integer yearBirth;
	
	private Integer monthBirth;

	public TypeAnimalsEnum getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(TypeAnimalsEnum typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(Integer yearBirth) {
		this.yearBirth = yearBirth;
	}

	public Integer getMonthBirth() {
		return monthBirth;
	}

	public void setMonthBirth(Integer monthBirth) {
		this.monthBirth = monthBirth;
	}
	
	

}
