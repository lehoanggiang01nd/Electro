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
import model.Category;
import model.Product;

/**
 *
 * @author MY LAPTOP
 */
public class CategoryDAO extends DBContext{
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String sql ="select * from Category";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Category(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
        public static void main(String[] args) {
        CategoryDAO dao = new CategoryDAO();
        List<Category> list = dao.getAllCategory();
            for (Category o : list) {
                    System.out.println(o);
            }
    }
}
