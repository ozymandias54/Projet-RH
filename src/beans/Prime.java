/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author User
 */
public class Prime {
    private int idPrime;
    private double montant;
    private String statut;
    private String motif;
    private int idEmploye;

    public Prime() {
    }

    public Prime(double montant, String statut, String motif, int idEmploye) {
        this.montant = montant;
        this.statut = statut;
        this.motif = motif;
        this.idEmploye = idEmploye;
    }

    public Prime(int idPrime, double montant, String statut, String motif, int idEmploye) {
        this.idPrime = idPrime;
        this.montant = montant;
        this.statut = statut;
        this.motif = motif;
        this.idEmploye = idEmploye;
    }

    public int getIdPrime() {
        return idPrime;
    }

    public void setIdPrime(int idPrime) {
        this.idPrime = idPrime;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }
    
    
}
