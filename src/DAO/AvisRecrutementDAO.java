/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.AvisRecrutement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AvisRecrutementDAO extends Dao<AvisRecrutement,String> {
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    AvisRecrutement avis = new AvisRecrutement();

    @Override
    public void supprimer(String id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from avisrecrutement where titrePoste = ?");
            prepare.setString(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvisRecrutementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(AvisRecrutement object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into avisrecrutement (titrePoste, description, ExigenceEmploi, dateFinCandidature) values (?,?,?,?)");
            prepare.setString(1, object.getTitrePoste());
            prepare.setString(2, object.getDescription());
            prepare.setString(3, object.getExigenceEmploi());
            prepare.setString(4, amj.format(object.getDateFin()));
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvisRecrutementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public AvisRecrutement rechercher(String id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from avisrecrutement where titrePoste = ?");
            prepare.setString(1, id);
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                avis.setTitrePoste(rs.getString("titrePoste"));
                avis.setDescription(rs.getString("description"));
                avis.setExigenceEmploi(rs.getString("ExigenceEmploi"));
                avis.setDateFin(rs.getDate("dateFinCandidature"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AvisRecrutementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return avis;
    }

    @Override
    public void modifier(AvisRecrutement objet, String id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("update avisrecrutement set titrePoste = ?, description = ?, exigenceEmploi = ?, dateFinCandidature = ? where titrePoste = ?");
            prepare.setString(1, objet.getTitrePoste());
                prepare.setString(2, objet.getDescription());
                    prepare.setString(3, objet.getExigenceEmploi());
                        prepare.setString(4, amj.format(objet.getDateFin()));
                            prepare.setString(5, id);
                            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AvisRecrutementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<AvisRecrutement> liste() {
        List<AvisRecrutement> li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from avisrecrutement");
            while(rs.next()){
                 avis.setTitrePoste(rs.getString("titrePoste"));
                avis.setDescription(rs.getString("description"));
                avis.setExigenceEmploi(rs.getString("ExigenceEmploi"));
                avis.setDateFin(rs.getDate("dateFinCandidature"));
                li.add(avis);
                avis = new AvisRecrutement();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvisRecrutementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          return li;
    }
  
    
}
