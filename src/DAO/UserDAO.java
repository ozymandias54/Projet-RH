/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UserDAO extends Dao<User,Integer> {
  User user = new User();
    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("delete from user where idUser = ?");
            p.setInt(1, id);
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(User object) {
        try {
            PreparedStatement p = this.connect.prepareStatement("insert into user(login,password,profil,idEmploye) values(?,?,?,?)");
            p.setString(1, object.getLogin());
            p.setString(2, object.getPassword());
            p.setString(3, object.getProfil());
            p.setInt(4, object.getIdEmploye());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User rechercher(Integer id) {
         try {
            PreparedStatement p = this.connect.prepareStatement("select * from user where idUser = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                user.setIdEmploye(rs.getInt("idEmploye"));
                user.setIdUser(rs.getInt("idUser"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setProfil(rs.getString("profil"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return user;
    }

    @Override
    public void modifier(User objet, Integer id) {
         try {
            PreparedStatement p = this.connect.prepareStatement("update user set login=?,password=?,profil=?,idEmploye=? where idUser = ?");
            p.setString(1, objet.getLogin());
            p.setString(2, objet.getPassword());
            p.setString(3, objet.getProfil());
            p.setInt(4, objet.getIdEmploye());
            p.setInt(5, id);
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> liste() {
        List<User> li = new ArrayList<>();
         try {
           ResultSet rs = this.connect.createStatement().executeQuery("select * from user");

            
            while(rs.next()){
                user.setIdEmploye(rs.getInt("idEmploye"));
                user.setIdUser(rs.getInt("idUser"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setProfil(rs.getString("profil"));
                li.add(user);
                user = new User();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
    public User Recherche(String login,String password){
      try {
          ResultSet rs = this.connect.createStatement().executeQuery(
                  "select * from user where login='"+login+"' and password='"+password+"'");
          user=null;
          if(rs.next()){
              user=new User();
              user.setIdEmploye(rs.getInt("idEmploye"));
                user.setIdUser(rs.getInt("idUser"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setProfil(rs.getString("profil"));
              
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      return user;
    }
    
}
