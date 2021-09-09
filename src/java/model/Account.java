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
public class Account {
    private int Aid;
    private String Email;
    private String Fname;
    private String Lname;
    private String Password;
    private String Address;
    private String Phone;
    private boolean isAdmin;

    public Account() {
    }

    public Account(int Aid, String Email, String Fname, String Lname, String Password, String Address, String Phone, boolean isAdmin) {
        this.Aid = Aid;
        this.Email = Email;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Password = Password;
        this.Address = Address;
        this.Phone = Phone;
        this.isAdmin = isAdmin;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int Aid) {
        this.Aid = Aid;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "Aid=" + Aid + ", Email=" + Email + ", Fname=" + Fname + ", Lname=" + Lname + ", Password=" + Password + ", Address=" + Address + ", Phone=" + Phone + ", isAdmin=" + isAdmin + '}';
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
