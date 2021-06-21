package fr.diginamic.factory;

import fr.diginamic.factory.dao.DAOFactory;
import fr.diginamic.factory.dao.ItelephonePortableFactory;

public class FactoryTest {

    public static ItelephonePortableFactory telephone = DAOFactory.getTelephoneDao();

    public static void main(String[] args) {

        ObjetConnecte telephone = ObjetConnecteFactory.getInstance(Limit.TELEPHONE, 15);
        System.out.println(telephone.getLimiteVolts());
    }
}
