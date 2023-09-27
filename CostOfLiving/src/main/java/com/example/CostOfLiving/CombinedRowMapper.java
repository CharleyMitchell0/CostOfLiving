package com.example.CostOfLiving;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;

import java.sql.SQLException;



// This Class will take care of any mismatch between data in SQL and Java

public class CombinedRowMapper implements RowMapper<CombinedDTO> {

    @Override

    public CombinedDTO mapRow (ResultSet rs, int rowNum) throws SQLException {

        // Create instances of SpecialistDTO and HubDTO
        SpecialistDTO specialistDTO = new SpecialistDTO();
        HubDTO hubDTO = new HubDTO();

        // Map columns to SpecialistDTO
        specialistDTO.setId(rs.getInt("id"));
        specialistDTO.setFirst_name(rs.getString("first_name"));
        specialistDTO.setLast_name(rs.getString("last_name"));
        specialistDTO.setEmail(rs.getString("email"));
        specialistDTO.setSpeciality(rs.getString("speciality"));
        specialistDTO.setRegion(rs.getString("region"));

        // Map columns to HubDTO
        hubDTO.setRegion(rs.getString("region"));
        hubDTO.setAddress(rs.getString("address"));
        hubDTO.setPhone_number(rs.getInt("phone_number"));

        // Create a CombinedDTO instance and set its properties
        CombinedDTO combinedDTO = new CombinedDTO(specialistDTO, hubDTO);

        return combinedDTO;

    }

}

