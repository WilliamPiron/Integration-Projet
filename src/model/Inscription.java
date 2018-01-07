package model;

public class Inscription {

    private int id_etudiant;
    private int id_cours;
    private String annee;
    private float note;

    public Inscription(int id_etudiant, int id_cours, String annee, int note) {
        this.id_etudiant = id_etudiant;
        this.id_cours = id_cours;
        this.annee = annee;
        this.note = note;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
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

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inscription{");
        sb.append("\n");
        sb.append("id_etudiant=").append(id_etudiant).append("\n");
        sb.append("id_cours=").append(id_cours).append("\n");
        sb.append("annee='").append(annee).append('\'').append("\n");
        sb.append("note=").append(note).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
