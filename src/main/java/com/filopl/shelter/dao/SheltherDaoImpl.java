package com.filopl.shelter.dao;

import com.filopl.shelter.entity.Shelther;
import com.filopl.shelter.model.SheltherRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SheltherDaoImpl implements SheltherDao{

    NamedParameterJdbcTemplate template;

    public SheltherDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Shelther> findAll() {
        return template.query("select * from shelther", new SheltherRowMapper());
    }

    @Override
    public void insertAnimal(Shelther animal) {
        final String sql = "insert into shelther(id, name, sex, age, breed) values(:id,:name,:sex, :age, :breed)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", animal.getId())
                .addValue("name", animal.getName())
                .addValue("sex", animal.getSex())
                .addValue("age", animal.getAge())
                .addValue("breed", animal.getBreed());
        template.update(sql,param, holder);

    }

    @Override
    public void updateAnimal(Shelther animal) {

    }

    @Override
    public void deleteEmployee(Shelther animal) {

    }
}
