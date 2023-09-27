package com.example.CostOfLiving;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class DAO {

    //    instantiating object jdbc, this is a magic object in-built into Java library

    private JdbcTemplate jdbcTemplate;


    @Autowired

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;

    }


    public List<SpecialistDTO> getSpecialistList() {

        String sql = "SELECT id, first_name, last_name, email, speciality, region from specialist";

        List<SpecialistDTO> specialists = jdbcTemplate.query(sql, new SpecialistRowMapper());

        return specialists;

    }


    public List<HubDTO> getHubList() {

        String sql = "SELECT region, address, phone_number from hub";

        List<HubDTO> hubs = jdbcTemplate.query(sql, new HubRowMapper());

        return hubs;

    }

    public SpecialistDTO getSpecialist(int id) {
        String sql = "SELECT * FROM SPECIALIST WHERE id = ?";


        SpecialistDTO specialistName = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SpecialistRowMapper());

        return specialistName;

    }

    public SpecialistDTO getSpecialistName(String speciality) {
        String sql = "SELECT * FROM Specialist WHERE speciality = ?";
        SpecialistDTO specialist = jdbcTemplate.queryForObject(sql, new SpecialistRowMapper(), speciality);
//        String response = specialist.getFirst_name() + " " + specialist.getLast_name();
//        return response;

        return specialist;
    }

    public CombinedDTO getCombinedData(String speciality, String region) {
        String sql = "SELECT id, first_name, last_name, email, speciality, specialist.region, " +
                "address, phone_number FROM Specialist JOIN hub ON specialist.region = hub.region WHERE " +
                "" +
                "specialist.speciality = ? AND specialist.region = ? ";

            CombinedDTO output = jdbcTemplate.queryForObject(sql, new CombinedRowMapper(), speciality, region);



        return output;
    }

}