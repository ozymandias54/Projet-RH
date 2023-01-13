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
public class Historique {
    private int idHistorique;
    private int candidat;
    private String poste;
    private Date dateDebut;

    public Historique() {
    }

    public Historique(int candidat, String poste, Date dateDebut) {
        this.candidat = candidat;
        this.poste = poste;
        this.dateDebut = dateDebut;
    }

    public Historique(int idHistorique, int candidat, String poste, Date dateDebut) {
        this.idHistorique = idHistorique;
        this.candidat = candidat;
        this.poste = poste;
        this.dateDebut = dateDebut;
    }

    public int getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(int idHistorique) {
        this.idHistorique = idHistorique;
    }

    public int getCandidat() {
        return candidat;
    }

    public void setCandidat(int candidat) {
        this.candidat = candidat;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    
}
