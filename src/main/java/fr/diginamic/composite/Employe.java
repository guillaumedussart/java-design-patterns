package fr.diginamic.composite;

public class Employe implements IElement{

    private String nom;
    private String prenom;
    private double salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public double calculerSalaire() {
        return salaire;
    }

    /**
     * get field
     *
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * set field
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * get field
     *
     * @return prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * set field
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * get field
     *
     * @return salaire
     */
    public double getSalaire() {
        return this.salaire;
    }

    /**
     * set field
     *
     * @param salaire
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
