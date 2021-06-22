package fr.diginamic.singleton.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoadDB {
    private static final String DB_URL;
    private static final String DB_USER;
    private static final String DB_PWD;

    private Connection connection;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("configuration");
        DB_URL = bundle.getString("db.url");
        DB_USER = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.password");
    }

    private LoadDB() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
    }

    private static class LoadDBHolder {
        private static LoadDB single;

        static {
            try {
                single = new LoadDB();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


    public static LoadDB getSingle() {

        return LoadDBHolder.single;
    }



    public Connection getConnection() {
        return connection;
    }
}
