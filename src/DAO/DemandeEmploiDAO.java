/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.DemandeEmploi;
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
public class DemandeEmploiDAO extends Dao<DemandeEmploi,Integer>{
     DemandeEmploi demande = new DemandeEmploi();

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from demandeemploye where idDemandeEmploye = ?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DemandeEmploiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(DemandeEmploi object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into demandeemploye(employeDemande,statut,idCandidat) values(?,?,?)");
            prepare.setString(1, object.getEmploiDemande());
            prepare.setString(2, object.getStatut());
            prepare.setInt(3, object.getIdCandidat());
            prepare.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DemandeEmploiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public DemandeEmploi rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from demandeemploye where idDemandeEmploye=?");
             prepare.setInt(1, id);
           ResultSet rs =  prepare.executeQuery();
           if(rs.next()){
               demande.setEmploiDemande(rs.getString("employeDemande"));
               demande.setIdCandidat(rs.getInt("idCandidat"));
               demande.setIdDemandeEmploi(rs.getInt("idDemandeEmploye"));
               demande.setStatut(rs.getString("statut"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(DemandeEmploiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return demande;
                
    }

    @Override
    public void modifier(DemandeEmploi objet, Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("update demandeemploye set employeDemande=?,statut=?,idCandidat=? where idDemandeEmploye=?");
            prepare.setString(1, objet.getEmploiDemande());
            prepare.setString(2, objet.getStatut());
            prepare.setInt(3, objet.getIdCandidat());
            prepare.setInt(4, id);
            prepare.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DemandeEmploiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DemandeEmploi> liste() {
        List<DemandeEmploi> li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from demandeemploye");
           while(rs.next()){
               demande.setEmploiDemande(rs.getString("employeDemande"));
               demande.setIdCandidat(rs.getInt("idCandidat"));
               demande.setIdDemandeEmploi(rs.getInt("idDemandeEmploye"));
               demande.setStatut(rs.getString("statut"));
               li.add(demande);
               demande = new DemandeEmploi();
           }
        } catch (SQLException ex) {
            Logger.getLogger(DemandeEmploiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
}
