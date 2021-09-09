/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MY LAPTOP
 */
public class Product {
    private int id;
    private String name;
    private String decs;
    private String image;
    private int price;
    private int Stock;

    public Product() {
    }

    public Product(int id, String name, String decs, String image, int price, int Stock) {
        this.id = id;
        this.name = name;
        this.decs = decs;
        this.image = image;
        this.price = price;
        this.Stock = Stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", decs=" + decs + ", image=" + image + ", price=" + price + ", Stock=" + Stock + '}';
    }
    
}
