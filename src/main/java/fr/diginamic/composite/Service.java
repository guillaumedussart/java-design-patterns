package fr.diginamic.composite;

import java.util.HashSet;
import java.util.Set;

public class Service implements IElement {

    private String nom;
    private Set<IElement> elements = new HashSet<>();



    public Service(String nom, Set<IElement> elements) {
        this.nom = nom;
        this.elements = elements;
    }

    @Override
    public double calculerSalaire() {
        double element = 0;
        for (IElement elem : elements) {
            element += elem.calculerSalaire();
        }
        return element;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Service{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
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
     * @return elements
     */
    public Set<IElement> getElements() {
        return this.elements;
    }

    /**
     * set field
     *
     * @param elements
     */
    public void setElements(Set<IElement> elements) {
        this.elements = elements;
    }
}
