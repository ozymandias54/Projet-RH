/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;

/**
 *
 * @author User
 */
public class Employe {
    private int idEmploye;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Date dateEmbauche;
   private boolean genre;
    private String poste;
    private double salaireDeBase;
    private String eMail;
    private int idDepartement;
    private int idEquipe;
    

    public Employe() {
    }

    public Employe(String nom, String prenom, Date dateNaissance, Date dateEmbauche, boolean genre, String poste, double salaireDeBase, String eMail, int idDepartement, int idEquipe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.genre = genre;
        this.poste = poste;
        this.salaireDeBase = salaireDeBase;
        this.eMail = eMail;
        this.idDepartement = idDepartement;
        this.idEquipe = idEquipe;
    }

    public Employe(String nom, String prenom, Date dateNaissance, boolean genre, String poste, double salaireDeBase, String eMail, int idDepartement, int idEquipe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.poste = poste;
        this.salaireDeBase = salaireDeBase;
        this.eMail = eMail;
        this.idDepartement = idDepartement;
        this.idEquipe = idEquipe;
    }

    public Employe(int idEmploye, String nom, String prenom, Date dateNaissance, boolean genre, String poste, double salaireDeBase, String eMail, int idDepartement, int idEquipe) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.poste = poste;
        this.salaireDeBase = salaireDeBase;
        this.eMail = eMail;
        this.idDepartement = idDepartement;
        this.idEquipe = idEquipe;
    }

    public Employe(int idEmploye, String nom, String prenom, Date dateNaissance, Date dateEmbauche, boolean genre, String poste, double salaireDeBase, String eMail, int idDepartement, int idEquipe) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.genre = genre;
        this.poste = poste;
        this.salaireDeBase = salaireDeBase;
        this.eMail = eMail;
        this.idDepartement = idDepartement;
        this.idEquipe = idEquipe;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public double getSalaireDeBase() {
        return salaireDeBase;
    }

    public void setSalaireDeBase(double salaireDeBase) {
        this.salaireDeBase = salaireDeBase;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }
 
   
    
}
