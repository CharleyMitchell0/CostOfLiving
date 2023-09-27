package com.example.CostOfLiving;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;

import java.sql.SQLException;



// This Class will take care of any mismatch between data in SQL and Java

public class SpecialistRowMapper implements RowMapper<SpecialistDTO> {

    @Override

    public SpecialistDTO mapRow (ResultSet rs, int rowNum) throws SQLException {



//        create a specialist object and set the properties based on database column names



        SpecialistDTO specialist = new SpecialistDTO();

        specialist.setId(rs.getInt("id"));

        specialist.setFirst_name(rs.getString("first_name"));

        specialist.setLast_name(rs.getString("last_name"));

        specialist.setEmail(rs.getString("email"));

        specialist.setSpeciality(rs.getString("speciality"));

        specialist.setRegion(rs.getString("region"));



        return specialist;

    }

}
