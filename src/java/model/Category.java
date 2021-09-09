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
public class Category {
    private int cid;
    private String cname;
    private String cimage;
    private String cDesc;

    public Category() {
    }

    public Category(int cid, String cname, String cimage, String cDesc) {
        this.cid = cid;
        this.cname = cname;
        this.cimage = cimage;
        this.cDesc = cDesc;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    @Override
    public String toString() {
        return "Category{" + "cid=" + cid + ", cname=" + cname + ", cimage=" + cimage + ", cDesc=" + cDesc + '}';
    }
    
}
