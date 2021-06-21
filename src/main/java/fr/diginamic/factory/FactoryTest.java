package fr.diginamic.factory;

public class FactoryTest {
    public static void main(String[] args) {
        ObjetConnecte telephone = new ObjetConnecte(10);
        telephone.CheckLimit(Limit.TELEPHONE);
        System.out.println(telephone.limiteVolts);
    }
}
