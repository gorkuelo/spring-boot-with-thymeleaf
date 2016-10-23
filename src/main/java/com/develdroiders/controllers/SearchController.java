package com.develdroiders.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.develdroiders.beans.Animal;
import com.develdroiders.beans.Animals;
import com.develdroiders.enums.TypeAnimalsEnum;

@Controller
public class SearchController {
	
	@RequestMapping("/searchWithFilter")
    public Animals greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        
        Animals result = new Animals();
        Animal animal1 = new Animal();
        animal1.setTypeAnimal(TypeAnimalsEnum.CAT);
        animal1.setName("El uñas");
        animal1.setWeight(14.3);
        animal1.setMonthBirth(1);
        animal1.setYearBirth(2013);
        
        Animal animal2 = new Animal();
        animal2.setTypeAnimal(TypeAnimalsEnum.DOG);
        animal2.setName("El cabrales");
        animal2.setWeight(20.5);
        animal2.setMonthBirth(12);
        animal2.setYearBirth(2009);
        
        List<Animal> listAnimals = new ArrayList<Animal>();
        listAnimals.add(animal1);
        listAnimals.add(animal2);
        result.setAnimals(listAnimals);
        return result;
    }

}
