package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class DAOFactory {
    private static final String DB_URL;
    static {
        ResourceBundle bundle = ResourceBundle.getBundle("configuration");
        DB_URL = bundle.getString("db.url");


    }

    private DAOFactory() {
    }
}
