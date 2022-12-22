/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Prime;
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
public class PrimeDAO extends Dao<Prime,Integer> {
  Prime prime = new Prime();
    @Override
    public void supprimer(Integer id) {
        try {
            PreparedStatement p = this.connect.prepareStatement("delete from prime where idPrime =?");
            p.setInt(1, id);
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inserer(Prime object) {
      try {
          PreparedStatement p = this.connect.prepareStatement("insert into prime(montant,statut,motif,idEmploye) values(?,?,?,?)");
          p.setDouble(1, object.getMontant());
          p.setString(2, object.getStatut());
          p.setString(3, object.getMotif());
          p.setInt(4, object.getIdEmploye());
          p.executeUpdate();
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    @Override
    public Prime rechercher(Integer id) {
      try {
          PreparedStatement p =this.connect.prepareStatement("select * from prime where idPrime = ?");
          p.setInt(1, id);
          ResultSet rs = p.executeQuery();
          if(rs.next()){
              prime.setIdEmploye(rs.getInt("idEmploye"));;
              prime.setIdPrime(rs.getInt("idPrime"));
              prime.setMontant(rs.getDouble("montant"));
              prime.setMotif(rs.getString("motif"));
              prime.setStatut(rs.getString("statut"));
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      return prime;
    }

    @Override
    public void modifier(Prime objet, Integer id) {
          try {
          PreparedStatement p = this.connect.prepareStatement("update prime set montant=?,statut=?,motif=?,idEmploye=? where idPrime = ?");
          p.setDouble(1, objet.getMontant());
          p.setString(2, objet.getStatut());
          p.setString(3, objet.getMotif());
          p.setInt(4, objet.getIdEmploye());
          p.setInt(5, id);
          p.executeUpdate();
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public void modifierStatut(String s,Integer id){
        try {
          PreparedStatement p = this.connect.prepareStatement("update prime set statut=? where idPrime = ?");
          p.setString(1, s);
          p.setInt(2, id);
          p.execute();
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    @Override
    public List<Prime> liste() {
       List<Prime> li = new ArrayList<>();
        try {
          ResultSet rs =this.connect.createStatement().executeQuery("select * from prime");
          while(rs.next()){
              prime.setIdEmploye(rs.getInt("idEmploye"));;
              prime.setIdPrime(rs.getInt("idPrime"));
              prime.setMontant(rs.getDouble("montant"));
              prime.setMotif(rs.getString("motif"));
              prime.setStatut(rs.getString("statut"));
              li.add(prime);
              prime = new Prime();
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       return li;
    }
    
    public List<Prime> listePrime(int id) {
       List<Prime> li = new ArrayList<>();
        try {
          ResultSet rs =this.connect.createStatement().executeQuery("select * from prime where idEmploye="+id);
          while(rs.next()){
              prime.setIdEmploye(rs.getInt("idEmploye"));;
              prime.setIdPrime(rs.getInt("idPrime"));
              prime.setMontant(rs.getDouble("montant"));
              prime.setMotif(rs.getString("motif"));
              prime.setStatut(rs.getString("statut"));
              li.add(prime);
              prime = new Prime();
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       return li;
    }
    
}
