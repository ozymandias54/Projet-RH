/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class Dao<T,TY> {
     Connection connect = ConnectDb.getConnection();
    public abstract void supprimer(TY id);
    public abstract void inserer(T object); 
    public abstract T rechercher(TY id);
     public abstract void modifier(T objet , TY id);
      public abstract List <T> liste();
    
}
