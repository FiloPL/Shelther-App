package com.filopl.shelter.model;

import com.filopl.shelter.entity.Shelther;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SheltherRowMapper implements RowMapper<Shelther> {
    @Override
    public Shelther mapRow(ResultSet resultSet, int i) throws SQLException {
        Shelther animal = new Shelther();
        animal.setId(resultSet.getInt("id"));
        animal.setName(resultSet.getString("name"));
        return animal;
    }
}
