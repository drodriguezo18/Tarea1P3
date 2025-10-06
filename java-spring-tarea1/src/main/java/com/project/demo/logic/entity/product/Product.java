package com.project.demo.logic.entity.product;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;


@Table(name = "`product`")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private Double stock;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private List<Category> categories;


    public Product() {}

    public List<Category> getCategory() {
        return categories;
    }
    public void setCategory(List<Category> categories) {
        this.categories = categories;
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
