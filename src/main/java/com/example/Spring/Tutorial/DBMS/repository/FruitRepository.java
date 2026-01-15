package com.example.Spring.Tutorial.DBMS.repository;

import com.example.Spring.Tutorial.DBMS.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {



}
