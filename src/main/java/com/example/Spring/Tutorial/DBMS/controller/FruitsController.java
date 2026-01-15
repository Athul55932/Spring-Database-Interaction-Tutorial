package com.example.Spring.Tutorial.DBMS.controller;


import com.example.Spring.Tutorial.DBMS.entity.Fruit;
import com.example.Spring.Tutorial.DBMS.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/Fruits")


@CrossOrigin(
        origins = "http://localhost:5173",
        allowedHeaders = {"Content-Type", "Authorization"},
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)


public class FruitsController {

    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping
    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }
    @PostMapping
    public Fruit AddFruit(@RequestBody Fruit fruit){
        return fruitRepository.save(fruit);
        //.save(fruit) have 2 functions if (id == null ) it inserts else it updates.
    }

}
