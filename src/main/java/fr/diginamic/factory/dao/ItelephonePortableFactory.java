package fr.diginamic.factory.dao;

import fr.diginamic.factory.entities.TelephonePortable;

import java.sql.SQLException;
import java.util.Set;

public class ItelephonePortableFactory implements IDAO<TelephonePortable, Long> {


    @Override
    public void create(TelephonePortable o) throws SQLException {

    }

    @Override
    public TelephonePortable findById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Set<TelephonePortable> findAll() throws SQLException {
        return null;
    }

    @Override
    public void update(TelephonePortable o) throws SQLException {

    }

    @Override
    public void delete(TelephonePortable o) {

    }

    @Override
    public void deleteById(Long id) throws SQLException {

    }
}
