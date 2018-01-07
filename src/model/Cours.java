package model;

public class Cours {

    private int id;
    private String libelle;
    private String type;
    private String niveau;
    private int heures;

    public Cours(int id, String libelle, String type, String niveau) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.niveau = niveau;
    }

    public Cours(int id, String type, String niveau, int heures) {
        this.id = id;
        this.type = type;
        this.niveau = niveau;
        this.heures = heures;
    }

    public Cours() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cours{");
        sb.append("\n");
        sb.append("id=").append(id).append("\n");
        sb.append("libelle='").append(libelle).append('\'').append("\n");
        sb.append("type='").append(type).append('\'').append("\n");
        sb.append("niveau='").append(niveau).append('\'').append("\n");
        sb.append("heures=").append(heures).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
