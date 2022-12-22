/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Projet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ProjetDAO extends Dao<Projet,Integer> {
    Projet projet = new Projet();
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("delete from projet where idProjet = ?");
            p.setInt(1, id);
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(Projet object) {
        try {
            PreparedStatement p = this.connect.prepareStatement("insert into projet(nomProjet,dateDebut,dateFin,mission,idEquipe) values(?,?,?,?,?)");
            p.setString(1, object.getNomProjet());
            p.setString(2, amj.format(object.getDateDebut()));
             p.setString(3, null);
             p.setString(4, object.getMission());
              p.setInt(5, object.getIdEquipe());
              p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Projet rechercher(Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("select * from projet where idProjet = ?");
            p.setInt(1, id);
           ResultSet rs =  p.executeQuery();
           if(rs.next()){
               projet.setDateDebut(rs.getDate("dateDebut"));
               projet.setDateFin(rs.getDate("dateFin"));
               projet.setIdEquipe(rs.getInt("idEquipe"));
               projet.setIdProjet(rs.getInt("idProjet"));
               projet.setMission(rs.getString("mission"));
               projet.setNomProjet(rs.getString("nomProjet"));
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projet;
    }

    @Override
    public void modifier(Projet objet, Integer id) {
         try {
            PreparedStatement p = this.connect.prepareStatement("update projet set nomProjet=?,dateDebut=?,dateFin=?,mission=?,idEquipe=? where idProjet = ?");
            p.setString(1, objet.getNomProjet());
            p.setString(2, amj.format(objet.getDateDebut()));
             p.setString(3, null);
             p.setString(4, objet.getMission());
              p.setInt(5, objet.getIdEquipe());
              p.setInt(6, id);
              p.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Projet> liste() {
        List<Projet> li = new ArrayList<>();
         try {
           ResultSet rs = this.connect.createStatement().executeQuery("select * from projet");
           while(rs.next()){
               projet.setDateDebut(rs.getDate("dateDebut"));
               projet.setDateFin(rs.getDate("dateFin"));
               projet.setIdEquipe(rs.getInt("idEquipe"));
               projet.setIdProjet(rs.getInt("idProjet"));
               projet.setMission(rs.getString("mission"));
               projet.setNomProjet(rs.getString("nomProjet"));
               li.add(projet);
               projet = new Projet();
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
    public int nombre(){
        int nbre = 0;
        try {
            
            ResultSet rs = this.connect.createStatement().executeQuery
                ("select count(*) as nbre from projet");
            if(rs.next()){
                nbre=rs.getInt("nbre");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nbre;
    }
    
    
    public void fini(Integer id) {
         try {
            PreparedStatement p = this.connect.prepareStatement("update projet set dateFin=NOW() where idProjet = ?");
            p.setInt(1, id);
              p.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Projet> recherche(String nom){
        List<Projet> li = new ArrayList<>();
         try {
       ResultSet rs = this.connect.createStatement().executeQuery
        ("select * from projet where nomProjet like '%"+nom+"%' or mission like '%"+nom+"%'");
       
       while(rs.next()){
               projet.setDateDebut(rs.getDate("dateDebut"));
               projet.setDateFin(rs.getDate("dateFin"));
               projet.setIdEquipe(rs.getInt("idEquipe"));
               projet.setIdProjet(rs.getInt("idProjet"));
               projet.setMission(rs.getString("mission"));
               projet.setNomProjet(rs.getString("nomProjet"));
               li.add(projet);
               projet = new Projet();
       }
    } catch (SQLException ex) {
        Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return li;
    }
}
