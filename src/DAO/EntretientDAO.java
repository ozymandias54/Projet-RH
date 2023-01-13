/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Entretient;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EntretientDAO extends Dao<Entretient,Integer>{
    Entretient entretient = new Entretient();
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from entretient where id = ?");
            prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EntretientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(Entretient object) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("insert into entretient (intervieweur,noteCandidat,candidat) values(?,?,?)");
             prepare.setInt(1, object.getIntervieweur());
             prepare.setInt(2, object.getNoteCandidat());
             prepare.setInt(3, object.getCandidat());
             prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EntretientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Entretient rechercher(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("select * from entretient where id = ?");
            prepare.setInt(1, id);
            ResultSet rs = prepare.executeQuery();
            if(rs.next()){
                entretient.setIdEntretient(rs.getInt("id"));
                entretient.setCandidat(rs.getInt("candidat"));
                entretient.setDateEntretient(rs.getDate("dateEntretient"));
                entretient.setIntervieweur(rs.getInt("intervieweur"));
                entretient.setNoteCandidat(rs.getInt("noteCandidat"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntretientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entretient;
    }

    @Override
    public void modifier(Entretient objet, Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE entretient SET intervieweur = ?,noteCandidat = ?,candidat = ? WHERE id = ?");
             prepare.setInt(1, objet.getIntervieweur());
             prepare.setInt(2, objet.getNoteCandidat());
             prepare.setInt(3, objet.getCandidat());
             prepare.setInt(4, id);
             prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EntretientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Entretient> liste() {
        List<Entretient> li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("SELECT * FROM entretient");
            while(rs.next()){
                  entretient.setIdEntretient(rs.getInt("id"));
                entretient.setCandidat(rs.getInt("candidat"));
                entretient.setDateEntretient(rs.getDate("dateEntretient"));
                entretient.setIntervieweur(rs.getInt("intervieweur"));
                entretient.setNoteCandidat(rs.getInt("noteCandidat"));
                li.add(entretient);
                entretient = new Entretient();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntretientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
}
