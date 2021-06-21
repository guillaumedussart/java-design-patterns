package fr.diginamic.factory;

public class ObjetConnecteFactory {

    public static ObjetConnecte getInstance(Limit type, int limitVolts) {
        switch (type) {
            case TABLETTE:
                return new Tablette(limitVolts);
            case TELEPHONE:
                return new TelephonePortable(limitVolts);
            case ENCEINTE:
                return new EnceinteConnecte(limitVolts);
            default:
                return null;
        }
    }
}
