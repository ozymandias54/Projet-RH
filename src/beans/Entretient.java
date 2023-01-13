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
public class Entretient {
    private int idEntretient;
    private Date dateEntretient;
    private int intervieweur;
    private int noteCandidat;
    private int candidat;

    public Entretient() {
    }

    public Entretient(int intervieweur, int noteCandidat, int candidat) {
        this.intervieweur = intervieweur;
        this.noteCandidat = noteCandidat;
        this.candidat = candidat;
    }

    public Entretient(Date dateEntretient, int intervieweur, int noteCandidat, int candidat) {
        this.dateEntretient = dateEntretient;
        this.intervieweur = intervieweur;
        this.noteCandidat = noteCandidat;
        this.candidat = candidat;
    }

    public Entretient(int idEntretient, Date dateEntretient, int intervieweur, int noteCandidat, int candidat) {
        this.idEntretient = idEntretient;
        this.dateEntretient = dateEntretient;
        this.intervieweur = intervieweur;
        this.noteCandidat = noteCandidat;
        this.candidat = candidat;
    }

    public int getIdEntretient() {
        return idEntretient;
    }

    public void setIdEntretient(int idEntretient) {
        this.idEntretient = idEntretient;
    }

    public Date getDateEntretient() {
        return dateEntretient;
    }

    public void setDateEntretient(Date dateEntretient) {
        this.dateEntretient = dateEntretient;
    }

    public int getIntervieweur() {
        return intervieweur;
    }

    public void setIntervieweur(int intervieweur) {
        this.intervieweur = intervieweur;
    }

    public int getNoteCandidat() {
        return noteCandidat;
    }

    public void setNoteCandidat(int noteCandidat) {
        this.noteCandidat = noteCandidat;
    }

    public int getCandidat() {
        return candidat;
    }

    public void setCandidat(int candidat) {
        this.candidat = candidat;
    }
    
}
