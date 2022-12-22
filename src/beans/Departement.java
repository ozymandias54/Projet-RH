/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author User
 */
public class Departement {
    private int idDepartement;
    private String nomDepartement;
    private String description;
    private String chefDepartement;

    public Departement() {
    }

    public Departement(String nomDepartement, String description, String chefDepartement) {
        this.nomDepartement = nomDepartement;
        this.description = description;
        this.chefDepartement = chefDepartement;
    }

    public Departement(int idDepartement, String nomDepartement, String description, String chefDepartement) {
        this.idDepartement = idDepartement;
        this.nomDepartement = nomDepartement;
        this.description = description;
        this.chefDepartement = chefDepartement;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChefDepartement() {
        return chefDepartement;
    }

    public void setChefDepartement(String chefDepartement) {
        this.chefDepartement = chefDepartement;
    }
    
    
}
