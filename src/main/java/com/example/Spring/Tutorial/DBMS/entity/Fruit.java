package com.example.Spring.Tutorial.DBMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="fruits")
public class Fruit {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String Fruit;
        private int Price;


//        public void setid(Long id){
//            this.id=id;
//        }
//
//        public void setPrice(int Price){
//            this.Price=Price;
//        }
//
//        public void setFruit(String Fruit){
//            this.Fruit=Fruit;
//        }
//
//
//        public Long getid(){
//            return this.id;
//        }
//        public String getFruit(){
//            return this.Fruit;
//        }
//
//        public int getPrice(){
//            return this.Price;
//        }



}
