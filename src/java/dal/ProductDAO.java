/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author MY LAPTOP
 */
public class ProductDAO extends DBContext{
        public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql ="select * from Product";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
        public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String sql ="select * from Product\n" +
                    "where Category_id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, cid);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
        public List<Product> getProductByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String sql ="select * from Product\n" +
                    "where [Product_Name] like ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1,"%" + txtSearch + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
        public Product getProductByID(String id) {
        String sql ="select * from Product\n" +
                    "where Product_id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    return new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            return null;
        }
        public Product getNewest(){
            String sql = "select top 1 * from Product\n" +
                         "order by Product_id desc";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    return new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            return null;
        }
        public void deleteProduct(String pid){
            String sql = "delete from Product\n" +
                         "where Product_id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, pid);
                st.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        public void addProduct(String name,String desc,String image,String price,String stock,String cid){
            String sql = "  insert into Product\n" +
                         "  values(?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, desc);
                st.setString(3, image);
                st.setString(4, price);
                st.setString(5, stock);
                st.setString(6, cid);
                st.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        public void updateProduct(String name,String desc,String image,String price,String stock,String cid,String pid){
            String sql = " Update Product\n" +
            "  set [Product_Name] = ?,\n" +
            "  [Product_Decs] = ?,\n" +
            "  [Image] = ?,\n" +
            "  [Price] = ?,\n" +
            "  [Stock] = ?,\n" +
            "  Category_id = ?\n" +
            "  where Product_id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, desc);
                st.setString(3, image);
                st.setString(4, price);
                st.setString(5, stock);
                st.setString(6, cid);
                st.setString(7, pid);
                st.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        public int getToltalProduct(){
            String sql = "select count(*) from Product";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            
            return 0;
        }
        public List<Product> pagingProduct(int index){
            List<Product> list = new ArrayList<>();
            String sql = "select * from Product\n" +
                        "order by Product_id\n" +
                        "offset ? rows fetch next 6 rows only";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setInt(1, (index-1)*6);                              
                ResultSet rs = st.executeQuery();  
                while(rs.next()){
                    list.add(new Product(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getInt(6)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            return list;
        }
                
        
        public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        //dao.updateProduct("Razer Mouse Bungee V2", "alaba trap", "https://assets3.razerzone.com/YuQNoYySsLzI0PjIYfPf00StT9A=/1500x1000/https%3A%2F%2Fhybrismediaprod.blob.core.windows.net%2Fsys-master-phoenix-images-container%2Fh98%2Fh0e%2F9081443155998%2FRC21-01210100-R3M1-0.jpeg", "500000", "4", "4", "14");
        //int count = dao.getToltalProduct();
//        List<Product> list = dao.pagingProduct(2);
//            for (Product o : list) {
//                System.out.println(o);
//            }
        List<Product> list = dao.getProductByName("a");
        System.out.println(list);
        
        //System.out.println(count);
        
        
        }
}
