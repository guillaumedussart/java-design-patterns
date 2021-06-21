package fr.diginamic.singleton;

import java.sql.SQLException;
import java.util.Set;

public interface IDAO<T,ID> {

    T findById(ID id) throws SQLException;
    Set<T> findAll() throws SQLException;
}
