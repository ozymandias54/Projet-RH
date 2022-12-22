/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author User
 */
public class User {
    private int idUser;
    private String login;
    private String password;
    private String profil;
    private int idEmploye;

    public User() {
    }

    public User(String login, String password, String profil, int idEmploye) {
        this.login = login;
        this.password = password;
        this.profil = profil;
        this.idEmploye = idEmploye;
    }

    public User(int idUser, String login, String password, String profil, int idEmploye) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.profil = profil;
        this.idEmploye = idEmploye;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }
    
    
}
