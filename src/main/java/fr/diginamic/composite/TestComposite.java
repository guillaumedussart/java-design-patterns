package fr.diginamic.composite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestComposite {
    public static void main(String[] args) {

        Employe employe1 = new Employe("roger","Moore",1200);
        Employe employe2 = new Employe("fred","Ronald",1200);
        Employe employe3 = new Employe("fredi","kroger",1200);
        Employe employe4 = new Employe("fredi1","kroger",1200);
        Employe employe5 = new Employe("fredi2","kroger",1200);
        Employe employe6 = new Employe("fredi3","kroger",1200);

        Set<IElement> employes = new HashSet<>();
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);
        employes.add(employe4);
        employes.add(employe5);
        employes.add(employe6);

        Service service1 = new Service("test",employes);
        System.out.println(service1.getNom() +" "+service1.calculerSalaire());


    }
}
