/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Equipe;
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
public class EquipeDAO extends Dao<Equipe,Integer> {
Equipe equipe = new Equipe();
    @Override
    public void supprimer(Integer id) {
    try {
        PreparedStatement p = this.connect.prepareStatement("delete from equipe where idEquipe = ?");
        p.setInt(1, id);
        p.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void inserer(Equipe object) {
        try {
            PreparedStatement p = this.connect.prepareStatement("insert into equipe(nombreDeMembre,chefEquipe,nomEquipe) values(?,?,?)");
            p.setInt(1, object.getNombreDeMembre());
              p.setString(2, object.getChefEquipe());
               p.setString(3, object.getNomEquipe());
               p.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Equipe rechercher(Integer id) {
         try {
        PreparedStatement p = this.connect.prepareStatement("select * from equipe where idEquipe = ?");
        p.setInt(1, id);
       ResultSet rs = p.executeQuery();
       if(rs.next()){
           equipe.setChefEquipe(rs.getString("chefEquipe"));
           equipe.setIdEquipe(rs.getInt("idEquipe"));
           equipe.setNomEquipe(rs.getString("nomEquipe"));
           equipe.setNombreDeMembre(rs.getInt("nombreDeMembre"));
       }
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
         return equipe;
    }

    @Override
    public void modifier(Equipe objet, Integer id) {
         try {
            PreparedStatement p = this.connect.prepareStatement("update equipe set nombreDeMembre=?,chefEquipe=?,nomEquipe=? where idEquipe = ?");
            p.setInt(1, objet.getNombreDeMembre());
              p.setString(2, objet.getChefEquipe());
               p.setString(3, objet.getNomEquipe());
               p.setInt(4, id);
               p.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Equipe> liste() {
        List<Equipe> li = new ArrayList<>();
         try {
       ResultSet rs = this.connect.createStatement().executeQuery("select * from equipe");
       
       while(rs.next()){
           equipe.setChefEquipe(rs.getString("chefEquipe"));
           equipe.setIdEquipe(rs.getInt("idEquipe"));
           equipe.setNomEquipe(rs.getString("nomEquipe"));
           equipe.setNombreDeMembre(rs.getInt("nombreDeMembre"));
           li.add(equipe);
           equipe = new Equipe();
       }
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return li;
    }
    
    public List<Equipe> recherche(String nom){
        List<Equipe> li = new ArrayList<>();
         try {
       ResultSet rs = this.connect.createStatement().executeQuery
        ("select * from equipe where nomEquipe like '%"+nom+"%' or chefEquipe like '%"+nom+"%'");
       
       while(rs.next()){
           equipe.setChefEquipe(rs.getString("chefEquipe"));
           equipe.setIdEquipe(rs.getInt("idEquipe"));
           equipe.setNomEquipe(rs.getString("nomEquipe"));
           equipe.setNombreDeMembre(rs.getInt("nombreDeMembre"));
           li.add(equipe);
           equipe = new Equipe();
       }
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return li;
    }
    public void updateMembre(){
        List<Equipe> liste=this.liste();
        for(int i=0;i<liste.size();i++){
            try {
                
                int idEquipe=liste.get(i).getIdEquipe();
                
                ResultSet rs = this.connect.createStatement().executeQuery
                ("SELECT COUNT(*) as nbre FROM employe where idEquipe="+idEquipe);
                
                if(rs.next()){
                    int membre=rs.getInt("nbre");
                    PreparedStatement p = this.connect.prepareStatement
                    ("update equipe set nombreDeMembre="+membre+" where idEquipe ="+idEquipe);
                    p.execute();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public int nombre(){
        int nbre = 0;
        try {
            
            ResultSet rs = this.connect.createStatement().executeQuery
                ("select count(*) as nbre from equipe");
            if(rs.next()){
                nbre=rs.getInt("nbre");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nbre;
    }
    
}
