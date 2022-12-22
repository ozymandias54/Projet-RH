/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.DemandeAbsence;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DemandeAbsenceDAO extends Dao<DemandeAbsence, Integer> {
    DemandeAbsence demande = new DemandeAbsence();
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from demandeAbsence where idDemandeAbsence = ?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(DemandeAbsence object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into demandeAbsence(motif,statut,idEmploye) values(?,?,?)");
              prepare.setString(1, object.getMotif());
              prepare.setString(2, object.getStatut());
              prepare.setInt(3, object.getIdEmploye());
              prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }

    @Override
    public DemandeAbsence rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from demandeAbsence where idDemandeAbsence=?");
            prepare.setInt(1, id);
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                demande.setDateCreation(rs.getDate("dateCreation"));
                demande.setDateDebut(rs.getDate("dateDebut"));
                demande.setDateFin(rs.getDate("dateFin"));
                demande.setIdDemandeAbsence(rs.getInt("idDemandeAbsence"));
                demande.setIdEmploye(rs.getInt("idEmploye"));
                demande.setMotif(rs.getString("motif"));
                demande.setStatut(rs.getString("statut"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return demande;
    }

    @Override
    public void modifier(DemandeAbsence objet, Integer id) {
         try {
            PreparedStatement prepare = this.connect.prepareStatement("update demandeAbsence set motif=?,statut=?,idEmploye=? where idDemandeAbsence=?");
            prepare.setString(1, objet.getMotif());
              prepare.setString(2, objet.getStatut());
              prepare.setInt(3, objet.getIdEmploye());
              prepare.setInt(4, id);
              prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifierAccepter(Date debut,Date fin,String statut, Integer id) {
         try {
            PreparedStatement prepare = this.connect.prepareStatement("update demandeAbsence set dateDebut=? , dateFin=?, statut=? where idDemandeAbsence=?");
            prepare.setString(1, amj.format(debut));
              prepare.setString(2, amj.format(fin));
              prepare.setString(3, statut);
              prepare.setInt(4, id);
              prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public List<DemandeAbsence> liste() {
        List<DemandeAbsence> li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from demandeAbsence");
            
            while(rs.next()){
                demande.setDateCreation(rs.getDate("dateCreation"));
                demande.setDateDebut(rs.getDate("dateDebut"));
                demande.setDateFin(rs.getDate("dateFin"));
                demande.setIdDemandeAbsence(rs.getInt("idDemandeAbsence"));
                demande.setIdEmploye(rs.getInt("idEmploye"));
                demande.setMotif(rs.getString("motif"));
                demande.setStatut(rs.getString("statut"));
                li.add(demande);
                demande = new DemandeAbsence();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DemandeAbsenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
}
