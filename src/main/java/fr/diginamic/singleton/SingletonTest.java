package fr.diginamic.singleton;

import fr.diginamic.singleton.jdbc.LoadDB;

import java.sql.SQLException;

public class SingletonTest {

    public static void main(String[] args) throws SQLException {
        LoadDB load = LoadDB.getSingle();
        System.out.println(load);
    }
}
