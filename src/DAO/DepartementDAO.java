/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Departement;
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
public class DepartementDAO extends Dao<Departement,Integer> {
    Departement departement = new Departement();

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from departement where idDepartement =?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(Departement object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into departement (nomDepartement,description,chefDepartement) values(?,?,?)");
            prepare.setString(1, object.getNomDepartement());
            prepare.setString(2, object.getDescription());
            prepare.setString(3, object.getChefDepartement());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Departement rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from departement where idDepartement =?");
            prepare.setInt(1, id);
            ResultSet rs =  prepare.executeQuery();
            if(rs.next()){
                departement.setChefDepartement(rs.getString("chefDepartement"));
                departement.setDescription(rs.getString("description"));
                departement.setIdDepartement(rs.getInt("idDepartement"));
                departement.setNomDepartement(rs.getString("nomDepartement"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departement;
    }

    @Override
    public void modifier(Departement objet, Integer id) {
         try {
            PreparedStatement prepare = this.connect.prepareStatement("update departement set nomDepartement=?,description=?,chefDepartement=? where idDepartement=?");
            prepare.setString(1, objet.getNomDepartement());
            prepare.setString(2, objet.getDescription());
            prepare.setString(3, objet.getChefDepartement());
            prepare.setInt(4, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Departement> liste() {
        List<Departement> li = new ArrayList<>();
         try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from departement");
            while(rs.next()){
                departement.setChefDepartement(rs.getString("chefDepartement"));
                departement.setDescription(rs.getString("description"));
                departement.setIdDepartement(rs.getInt("idDepartement"));
                departement.setNomDepartement(rs.getString("nomDepartement"));
                li.add(departement);
                departement = new Departement();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
    public List<Departement> recherche(String nom){
        List<Departement> li = new ArrayList<>();
         try {
       ResultSet rs = this.connect.createStatement().executeQuery
        ("select * from departement where nomDepartement like '%"+nom+"%' or chefDepartement like '%"+nom+"%'");
       
       while(rs.next()){
                departement.setChefDepartement(rs.getString("chefDepartement"));
                departement.setDescription(rs.getString("description"));
                departement.setIdDepartement(rs.getInt("idDepartement"));
                departement.setNomDepartement(rs.getString("nomDepartement"));
                li.add(departement);
                departement = new Departement();
       }
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return li;
    }
    public int nombre(){
        int nbre = 0;
        try {
            
            ResultSet rs = this.connect.createStatement().executeQuery
                ("select count(*) as nbre from departement");
            if(rs.next()){
                nbre=rs.getInt("nbre");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nbre;
    }
    
}
