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
public class Items {
    private Product product;
    private int totalPrice;
    private int Quantity;

    public Items() {
    }

    public Items(Product product, int totalPrice, int Quantity) {
        this.product = product;
        this.totalPrice = totalPrice;
        this.Quantity = Quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Items{" + "product=" + product + ", totalPrice=" + totalPrice + ", Quantity=" + Quantity + '}';
    }
    
    
}
