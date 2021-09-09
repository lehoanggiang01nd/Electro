/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author MY LAPTOP
 */
public class Order {
    private int oid;
    private Date orderDate;
    private int orderTotal;
    private int cid;
    
    private Account account;
    private List<Items> items;

    public Order() {
    }

    public Order(int oid, Date orderDate, int orderTotal, int cid, Account account, List<Items> items) {
        this.oid = oid;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.cid = cid;
        this.account = account;
        this.items = items;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" + "oid=" + oid + ", orderDate=" + orderDate + ", orderTotal=" + orderTotal + ", cid=" + cid + ", account=" + account + ", items=" + items + '}';
    }
    
    
}
