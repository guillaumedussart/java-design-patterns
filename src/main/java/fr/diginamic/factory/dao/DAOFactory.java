package fr.diginamic.factory.dao;



public final class DAOFactory {


    private DAOFactory() {
    }

    public static ItelephonePortableFactory getTelephoneDao(){
        ItelephonePortableFactory dao = null;
        dao = new ItelephonePortableFactory();
        return dao;
    }
}
