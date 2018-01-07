package model;

public class Enseigne {

    private int id_enseignant;
    private int id_cours;
    private String annee;
    private int heures;

    public Enseigne(int id_enseignant, int id_cours, String annee, int heures) {
        this.id_enseignant = id_enseignant;
        this.id_cours = id_cours;
        this.annee = annee;
        this.heures = heures;
    }

    public Enseigne() {
    }

    public Enseigne(int id_enseignant, int id_cours, String annee) {
        this.id_enseignant = id_enseignant;
        this.id_cours = id_cours;
        this.annee = annee;
    }

    public int getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(int id_enseignant) {
        this.id_enseignant = id_enseignant;
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Enseigne{");
        sb.append("\n");
        sb.append("id_enseignant=").append(id_enseignant).append("\n");
        sb.append("id_cours=").append(id_cours).append("\n");
        sb.append("annee='").append(annee).append('\'').append("\n");
        sb.append("heures=").append(heures).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
