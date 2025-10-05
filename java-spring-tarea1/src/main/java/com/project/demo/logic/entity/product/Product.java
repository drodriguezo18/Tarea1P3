package com.project.demo.logic.entity.product;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "`product`")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private Double stock;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Product() {

    }

    public Product(String name, int price, Double stock, Category category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }


    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public Double getStock() {
        return stock;
    }
    public void setStock(Double stock) {this.stock = stock;}



















}
