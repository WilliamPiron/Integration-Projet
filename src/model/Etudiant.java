package model;

public class Etudiant {

    private String id;
    private String nom;
    private String prenom;
    private String provenance;
    private String formationPrecedente;
    private String paysFormationprecedente;
    private String anneeDebut;
    private String age;
    private String niveauInsertion;

    public Etudiant(String id, String nom, String prenom, String provenance, String formationPrecedente, String paysFormationprecedente, String anneeDebut, String age, String niveauInsertion) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.provenance = provenance;
        this.formationPrecedente = formationPrecedente;
        this.paysFormationprecedente = paysFormationprecedente;
        this.anneeDebut = anneeDebut;
        this.age = age;
        this.niveauInsertion = niveauInsertion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getFormationPrecedente() {
        return formationPrecedente;
    }

    public void setFormationPrecedente(String formationPrecedente) {
        this.formationPrecedente = formationPrecedente;
    }

    public String getPaysFormationprecedente() {
        return paysFormationprecedente;
    }

    public void setPaysFormationprecedente(String paysFormationprecedente) {
        this.paysFormationprecedente = paysFormationprecedente;
    }

    public String getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(String anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNiveauInsertion() {
        return niveauInsertion;
    }

    public void setNiveauInsertion(String niveauInsertion) {
        this.niveauInsertion = niveauInsertion;
    }
}
