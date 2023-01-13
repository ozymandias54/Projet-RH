/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Historique;
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
public class HistoriqueDAO extends Dao<Historique,Integer> {
    Historique h = new Historique();
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("delete from historique where id =?");
             prepare.setInt(1, id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HistoriqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(Historique object) {
        try {
            PreparedStatement p = this.connect.prepareStatement("insert into historique(candidat,poste,dateDebut) values(?,?,?)");
             p.setInt(1, object.getCandidat());
          p.setString(2, object.getPoste());
          p.setString(3, amj.format(object.getDateDebut()));
          p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HistoriqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Historique rechercher(Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("select * from historique where id = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                h.setIdHistorique(rs.getInt("id"));
                h.setCandidat(rs.getInt("candidat"));
                h.setPoste(rs.getString("poste"));
                h.setDateDebut(rs.getDate("dateDebut"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoriqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }

    @Override
    public void modifier(Historique objet, Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("update historique set candidat = ?,poste = ?,dateDebut = ? where id = ?");
             p.setInt(1, objet.getCandidat());
          p.setString(2, objet.getPoste());
          p.setString(3, amj.format(objet.getDateDebut()));
          p.setInt(4, id);
          p.executeUpdate();
                  } catch (SQLException ex) {
            Logger.getLogger(HistoriqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Historique> liste() {
        List<Historique> li = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from historique");
             while(rs.next()){
                h.setIdHistorique(rs.getInt("id"));
                h.setCandidat(rs.getInt("candidat"));
                h.setPoste(rs.getString("poste"));
                h.setDateDebut(rs.getDate("dateDebut"));
                li.add(h);
                h = new Historique();
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoriqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }
    
}
