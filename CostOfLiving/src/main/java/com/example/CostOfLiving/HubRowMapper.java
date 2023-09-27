package com.example.CostOfLiving;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;

import java.sql.SQLException;



public class HubRowMapper implements RowMapper<HubDTO> {

    @Override

    public HubDTO mapRow (ResultSet rs, int rowNum) throws SQLException {



        HubDTO hub = new HubDTO();

        hub.setRegion(rs.getString("region"));

        hub.setAddress(rs.getString("address"));

        hub.setPhone_number(rs.getInt("phone_number"));



        return hub;

    }



}