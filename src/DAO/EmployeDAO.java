/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Employe;
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
public class EmployeDAO extends Dao<Employe,Integer>{
    Employe employe = new Employe();
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from employe where idEmploye = ?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void inserer(Employe object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into  employe (nom,prenom,dateNaissance,idEquipe,genre,poste,salaireDeBase,eMail,idDepartement) values(?,?,?,?,?,?,?,?,?) ");
            prepare.setString(1, object.getNom());
            prepare.setString(2, object.getPrenom());
            prepare.setString(3, amj.format(object.getDateNaissance()));
             prepare.setInt(4, object.getIdEquipe());
             prepare.setBoolean(5,object.isGenre());
             prepare.setString(6, object.getPoste());
             prepare.setDouble(7, object.getSalaireDeBase());
             prepare.setString(8, object.geteMail());
             prepare.setInt(9, object.getIdDepartement());
              
             prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Employe rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from employe where idEmploye = ?");
            prepare.setInt(1, id);
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                employe.setIdEmploye(rs.getInt("idEmploye"));
                employe.setNom(rs.getString("nom"));
                employe.setPrenom(rs.getString("prenom"));
                employe.setDateEmbauche(rs.getDate("dateEmbauche"));
                employe.setDateNaissance(rs.getDate("dateNaissance"));
                employe.setGenre(rs.getBoolean("genre"));
                employe.setIdDepartement(rs.getInt("idDepartement"));
                employe.setIdEquipe(rs.getInt("idEquipe"));
                employe.setPoste(rs.getString("poste"));
                employe.setSalaireDeBase(rs.getDouble("salaireDeBase"));
                employe.seteMail(rs.getString("eMail"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employe;
    }

    @Override
    public void modifier(Employe objet, Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("update employe set nom=?,prenom=?,dateNaissance=?,idEquipe=?,genre=?,poste=?,salaireDeBase=?,eMail=?,idDepartement=? where idEmploye = ?");
            prepare.setString(1, objet.getNom());
            prepare.setString(2, objet.getPrenom());
            prepare.setString(3, amj.format(objet.getDateNaissance()));
             prepare.setInt(4, objet.getIdEquipe());
             prepare.setBoolean(5,objet.isGenre());
             prepare.setString(6, objet.getPoste());
             prepare.setDouble(7, objet.getSalaireDeBase());
             prepare.setString(8, objet.geteMail());
             prepare.setInt(9, objet.getIdDepartement());
             prepare.setInt(10, id);
             prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Employe> liste() {
        List<Employe>li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from employe");
           
            while(rs.next()){
                employe.setIdEmploye(rs.getInt("idEmploye"));
                employe.setNom(rs.getString("nom"));
                employe.setPrenom(rs.getString("prenom"));
                employe.setDateEmbauche(rs.getDate("dateEmbauche"));
                employe.setDateNaissance(rs.getDate("dateNaissance"));
                employe.setGenre(rs.getBoolean("genre"));
                employe.setIdDepartement(rs.getInt("idDepartement"));
                employe.setIdEquipe(rs.getInt("idEquipe"));
                employe.setPoste(rs.getString("poste"));
                employe.setSalaireDeBase(rs.getDouble("salaireDeBase"));
                employe.seteMail(rs.getString("eMail"));
                li.add(employe);
                employe = new Employe();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
    public List<Employe> recherche(String nom){
        List<Employe>li = new ArrayList<>();
         try {
       ResultSet rs = this.connect.createStatement().executeQuery
        ("select * from employe where nom like '%"+nom+"%' or prenom like '%"+nom+"%'");
       
       while(rs.next()){
                employe.setIdEmploye(rs.getInt("idEmploye"));
                employe.setNom(rs.getString("nom"));
                employe.setPrenom(rs.getString("prenom"));
                employe.setDateEmbauche(rs.getDate("dateEmbauche"));
                employe.setDateNaissance(rs.getDate("dateNaissance"));
                employe.setGenre(rs.getBoolean("genre"));
                employe.setIdDepartement(rs.getInt("idDepartement"));
                employe.setIdEquipe(rs.getInt("idEquipe"));
                employe.setPoste(rs.getString("poste"));
                employe.setSalaireDeBase(rs.getDouble("salaireDeBase"));
                employe.seteMail(rs.getString("eMail"));
                li.add(employe);
                employe = new Employe();
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
                ("select count(*) as nbre from employe");
            if(rs.next()){
                nbre=rs.getInt("nbre");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nbre;
    }
    
}
