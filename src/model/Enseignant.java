package model;

public class Enseignant {

    private int id;
    private String nom;
    private String prenom;
    private String mail;

    public Enseignant(int id, String nom, String prenom, String mail) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public Enseignant(){
    }

    public Enseignant(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Enseignant{");
        sb.append("\n");
        sb.append("id=").append(id).append("\n");
        sb.append("nom='").append(nom).append('\'').append("\n");
        sb.append("prenom='").append(prenom).append('\'').append("\n");
        sb.append("mail='").append(mail).append('\'').append("\n");
        sb.append('}');
        return sb.toString();
    }
}
