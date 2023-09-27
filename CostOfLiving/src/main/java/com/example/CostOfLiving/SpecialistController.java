package com.example.CostOfLiving;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.web.bind.annotation.*;


import java.util.List;



// Specialist Controller Class will handle incoming HTTP requests

// Creating Controller with end point(full name), which will connect with DAO, DAO with Jdbc to access Database/Specialist

// table and retrieve Specialist full name (first and last name)



@RestController
@CrossOrigin("*")

public class SpecialistController {


//    now we need to connect Controller with DAO

    @Autowired
    private DAO dao;


    @Autowired

    public void setDao(DAO dao) {

        this.dao = dao;

    }


//    end point

    @RequestMapping("/all")

    public List<SpecialistDTO> getSpecialist() {

        return this.dao.getSpecialistList();

    }
    //  end point

    @RequestMapping("/specialist")

    public SpecialistDTO getSpecialistById(@RequestParam int id) {

        return this.dao.getSpecialist(id);
    }

    @RequestMapping("/output")
    public SpecialistDTO getSpecialistName(@RequestParam String speciality) {
        return this.dao.getSpecialistName(speciality);
    }

    @GetMapping("/test/{speciality}/{region}")
//    @ResponseBody
    public CombinedDTO getCombinedData(@PathVariable String speciality, @PathVariable String region) {
        CombinedDTO output = dao.getCombinedData(speciality, region);

        // Check if the specialist exists or not
        if (output != null) {
            return output; // Return the data in JSON format
        } else {
            // Handle the case where the specialist doesn't exist
            // To add error
            return null;
        }
    }

//    @GetMapping("/test/{speciality}/{region}")
////    @ResponseBody
//    public SpecialistDTO getCombinedData(@PathVariable String speciality, @PathVariable String region) {
//        SpecialistDTO output = dao.getCombinedData(speciality, region);
//
//
//
//        // Check if the specialist exists or not
//        if (output != null) {
//            return output; // Return the data in JSON format
//        } else {
//            // Handle the case where the specialist doesn't exist
//            // To add error
//            return null;
//        }
//    }

}







