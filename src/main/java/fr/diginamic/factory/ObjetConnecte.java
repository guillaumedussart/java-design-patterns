package fr.diginamic.factory;

public abstract class ObjetConnecte {

    public int limiteVolts;


    public ObjetConnecte(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    public ObjetConnecte CheckLimit(Limit limit){
        switch(limit) {
            case TELEPHONE:
                return new TelephonePortable(10);
            case ENCEINTE:
                return new EnceinteConnecte(12);
            case TABLETTE:
                return new Tablette(13);
            default:
                return null;
        }
    }

    /**
     * get field
     *
     * @return limiteVolts
     */
    public int getLimiteVolts() {
        return this.limiteVolts;
    }

    /**
     * set field
     *
     * @param limiteVolts
     */
    public void setLimiteVolts(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    }
}
