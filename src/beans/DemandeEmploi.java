/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author User
 */
public class DemandeEmploi {
    private int idDemandeEmploi;
    private String emploiDemande;
    private String statut;
    private int idCandidat;

    public DemandeEmploi() {
    }

    public DemandeEmploi(String emploiDemande, String statut, int idCandidat) {
        this.emploiDemande = emploiDemande;
        this.statut = statut;
        this.idCandidat = idCandidat;
    }

    public DemandeEmploi(int idDemandeEmploi, String emploiDemande, String statut, int idCandidat) {
        this.idDemandeEmploi = idDemandeEmploi;
        this.emploiDemande = emploiDemande;
        this.statut = statut;
        this.idCandidat = idCandidat;
    }

    public int getIdDemandeEmploi() {
        return idDemandeEmploi;
    }

    public void setIdDemandeEmploi(int idDemandeEmploi) {
        this.idDemandeEmploi = idDemandeEmploi;
    }

    public String getEmploiDemande() {
        return emploiDemande;
    }

    public void setEmploiDemande(String emploiDemande) {
        this.emploiDemande = emploiDemande;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }
    
    
}
