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
public class AvisRecrutement {
    private String titrePoste;
    private String description;
    private String exigenceEmploi;
    private Date dateFin;

    public AvisRecrutement() {
    }

    public AvisRecrutement(String titrePoste, String description, String exigenceEmploi, Date dateFin) {
        this.titrePoste = titrePoste;
        this.description = description;
        this.exigenceEmploi = exigenceEmploi;
        this.dateFin = dateFin;
    }

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExigenceEmploi() {
        return exigenceEmploi;
    }

    public void setExigenceEmploi(String exigenceEmploi) {
        this.exigenceEmploi = exigenceEmploi;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    
    
}
