package model;

public class Cours {

    private String id;
    private String libelle;
    private String type;
    private String niveau;
    private int heures;

    public Cours(String id, String libelle, String type, String niveau, int heures) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.niveau = niveau;
        this.heures = heures;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }
}
