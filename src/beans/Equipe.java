/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author User
 */
public class Equipe {
    private int idEquipe;
    private int nombreDeMembre;
    private String chefEquipe;
    private String nomEquipe;

    public Equipe() {
    }

    public Equipe(int nombreDeMembre, String chefEquipe, String nomEquipe) {
        this.nombreDeMembre = nombreDeMembre;
        this.chefEquipe = chefEquipe;
        this.nomEquipe = nomEquipe;
    }

    public Equipe(int idEquipe, int nombreDeMembre, String chefEquipe, String nomEquipe) {
        this.idEquipe = idEquipe;
        this.nombreDeMembre = nombreDeMembre;
        this.chefEquipe = chefEquipe;
        this.nomEquipe = nomEquipe;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getNombreDeMembre() {
        return nombreDeMembre;
    }

    public void setNombreDeMembre(int nombreDeMembre) {
        this.nombreDeMembre = nombreDeMembre;
    }

    public String getChefEquipe() {
        return chefEquipe;
    }

    public void setChefEquipe(String chefEquipe) {
        this.chefEquipe = chefEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
    
    
}
