package model;

public class Inscription {

    private String id_etudiant;
    private String id_cours;
    private String annee;
    private int note;

    public Inscription(String id_etudiant, String id_cours, String annee, int note) {
        this.id_etudiant = id_etudiant;
        this.id_cours = id_cours;
        this.annee = annee;
        this.note = note;
    }

    public String getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(String id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public String getId_cours() {
        return id_cours;
    }

    public void setId_cours(String id_cours) {
        this.id_cours = id_cours;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
