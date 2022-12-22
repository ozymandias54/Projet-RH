/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Candidat;
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
public class CandidatDAO extends Dao<Candidat,Integer> {
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    Candidat candidat = new Candidat();

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from candidat where idCandidat = ?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void inserer(Candidat object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into candidat(nom,prenom,dateNaissance,genre,competence)values(?,?,?,?,?)");
            prepare.setString(1, object.getNom());
            prepare.setString(2, object.getPrenom());
            prepare.setString(3, amj.format(object.getDateNaissance()));
            prepare.setBoolean(4, object.isGenre());
            prepare.setString(5, object.getCompetence());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  public Candidat dernierCandidat(){
      try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from candidat where idCandidat=(select MAX(idCandidat) from candidat)");
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                candidat.setIdCandidat(rs.getInt("idCandidat"));
                candidat.setNom(rs.getString("nom"));
                candidat.setPrenom(rs.getString("prenom"));
                candidat.setDateNaissance(rs.getDate("dateNaissance"));
                candidat.setDateCandidature(rs.getDate("dateCandidature"));
                candidat.setGenre(rs.getBoolean("genre"));
                candidat.setCompetence(rs.getString("competence"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return candidat;
  }
    @Override
    public Candidat rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from candidat where idCandidat = ?");
            prepare.setInt(1, id);
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                candidat.setIdCandidat(rs.getInt("idCandidat"));
                candidat.setNom(rs.getString("nom"));
                candidat.setPrenom(rs.getString("prenom"));
                candidat.setDateNaissance(rs.getDate("dateNaissance"));
                candidat.setDateCandidature(rs.getDate("dateCandidature"));
                candidat.setGenre(rs.getBoolean("genre"));
                candidat.setCompetence(rs.getString("competence"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return candidat;
                
    }
    

    @Override
    public void modifier(Candidat objet, Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("update candidat set nom=?,prenom=?,dateNaissance=?,genre=?,competence=? where idCandidat = ?");
            prepare.setString(1, objet.getNom());
            prepare.setString(2, objet.getPrenom());
            prepare.setString(3, amj.format(objet.getDateNaissance()));
            prepare.setBoolean(4, objet.isGenre());
            prepare.setString(5, objet.getCompetence());
            prepare.setInt(6, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Candidat> liste() {
        List<Candidat> li = new ArrayList<>();
         try {
             ResultSet rs = this.connect.createStatement().executeQuery("select * from candidat");
            while(rs.next()){
                candidat.setIdCandidat(rs.getInt("idCandidat"));
                candidat.setNom(rs.getString("nom"));
                candidat.setPrenom(rs.getString("prenom"));
                candidat.setDateNaissance(rs.getDate("dateNaissance"));
                candidat.setDateCandidature(rs.getDate("dateCandidature"));
                candidat.setGenre(rs.getBoolean("genre"));
                candidat.setCompetence(rs.getString("competence"));
                li.add(candidat);
                candidat = new Candidat();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CandidatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          return li;
    }
   
    
}
