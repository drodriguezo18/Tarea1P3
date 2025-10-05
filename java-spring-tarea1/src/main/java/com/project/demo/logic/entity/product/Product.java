package com.project.demo.logic.entity.product;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.project.demo.logic.entity.user.User;


@Table(name = "`product`")
@Entity
public class Product {
    @Id
    @GeneratedValue(startegy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private int stock;
    private String category;


    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

















}
