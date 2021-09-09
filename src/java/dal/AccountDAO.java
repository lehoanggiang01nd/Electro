/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author MY LAPTOP
 */
public class AccountDAO extends DBContext{
    public Account getAccount(String Email,String Password){
        String sql ="select * from Customer\n" +
                    "where [Email] = ?\n" +
                    "and Password = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, Email);
            st.setString(2, Password);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getBoolean(8));
            }    
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public Account login(String Email,String Password){
        String sql ="select * from Customer\n" +
                    "where [Email] = ?\n" +
                    "and Password = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, Email);
            st.setString(2, Password);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getBoolean(8));
            }    
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public Account checkAccount(String Email,String Phone){
        String sql ="select * from Customer\n" +
                    "where [Email] = ?\n" +
                    "or Phone = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, Email);
            st.setString(2, Phone);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getBoolean(8));
            }    
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public void signup(String Email,String pass,String Fname,String Lname,String Address,String Phone){
        String sql ="insert into Customer\n" +
                    "values(?,?,?,?,?,?,0)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,Email);
            st.setString(2,Fname);
            st.setString(3,Lname);
            st.setString(4,pass);
            st.setString(5,Address);
            st.setString(6,Phone);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
//    public static void main(String[] args) {
//        AccountDAO dao = new AccountDAO();
//        Account a = dao.login("vuaphepthuat@gmail.com","abcdef");
//        System.out.println(a);
//    }
}
