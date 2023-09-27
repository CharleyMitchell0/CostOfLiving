package com.example.CostOfLiving;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class HubController {

    private DAO dao;

    @Autowired

    public void setDao(DAO dao) {

        this.dao = dao;

    }

//end point

    @RequestMapping("/allhubs")

    public List<HubDTO> getHubList() {

        return this.dao.getHubList();

    }

//    @GetMapping("/test/{region}")
//    @ResponseBody
//    public hubDTO getSpecialistTest(@PathVariable String region) {
//        SpecialistDTO hub = dao.getSpecialistTest(region);
//
//        // Check if the specialist exists or not
//        if (specialist != null) {
//            return specialist; // Return the data in JSON format
//        } else {
//            // Handle the case where the specialist doesn't exist
//            // You can return an error message or an appropriate response here
//            return null;
//        }
//    }

}