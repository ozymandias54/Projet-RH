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
public class DemandeAbsence {
    private int idDemandeAbsence;
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin;
    private String motif;
    private String statut;
    private int idEmploye;

    public DemandeAbsence() {
    }

    public DemandeAbsence(Date dateCreation, Date dateDebut, Date dateFin, String motif, String statut, int idEmploye) {
        this.dateCreation = dateCreation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.motif = motif;
        this.statut = statut;
        this.idEmploye = idEmploye;
    }

    public DemandeAbsence(String motif, String statut, int idEmploye) {
        this.motif = motif;
        this.statut = statut;
        this.idEmploye = idEmploye;
    }

    public DemandeAbsence(int idDemandeAbsence, Date dateCreation, Date dateDebut, Date dateFin, String motif, String statut, int idEmploye) {
        this.idDemandeAbsence = idDemandeAbsence;
        this.dateCreation = dateCreation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.motif = motif;
        this.statut = statut;
        this.idEmploye = idEmploye;
    }

    public int getIdDemandeAbsence() {
        return idDemandeAbsence;
    }

    public void setIdDemandeAbsence(int idDemandeAbsence) {
        this.idDemandeAbsence = idDemandeAbsence;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }
    
    
}
