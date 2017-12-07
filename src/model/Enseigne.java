package model;

public class Enseigne {

    private String id_enseignant;
    private String id_cours;
    private String annee;
    private int heures;

    public Enseigne(String id_enseignant, String id_cours, String annee, int heures) {
        this.id_enseignant = id_enseignant;
        this.id_cours = id_cours;
        this.annee = annee;
        this.heures = heures;
    }

    public String getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(String id_enseignant) {
        this.id_enseignant = id_enseignant;
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

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }
}
