package model;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private String provenance;
    private String formationPrecedente;
    private String paysFormationprecedente;
    private String anneeDebut;
    private int age;
    private String niveauInsertion;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom, String provenance, String formationPrecedente,
                    String paysFormationprecedente, String anneeDebut, int age, String niveauInsertion) {
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

    public Etudiant(int id, String nom, String prenom, String provenance, String formationPrecedente,
                    String niveauInsertion) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.provenance = provenance;
        this.formationPrecedente = formationPrecedente;
        this.niveauInsertion = niveauInsertion;
    }

    public Etudiant(int id, String nom, String provenance, String formationPrecedente,
                    String paysFormationprecedente, String anneeDebut, String niveauInsertion) {
        this.id = id;
        this.nom = nom;
        this.provenance = provenance;
        this.formationPrecedente = formationPrecedente;
        this.paysFormationprecedente = paysFormationprecedente;
        this.anneeDebut = anneeDebut;
        this.niveauInsertion = niveauInsertion;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNiveauInsertion() {
        return niveauInsertion;
    }

    public void setNiveauInsertion(String niveauInsertion) {
        this.niveauInsertion = niveauInsertion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append("Etudiant{");
        sb.append("\n");
        sb.append("id=").append(id).append("\n");
        sb.append("prenom=").append(prenom).append("\n");
        sb.append("nom=").append(nom).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
