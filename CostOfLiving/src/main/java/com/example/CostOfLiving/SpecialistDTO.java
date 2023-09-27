package com.example.CostOfLiving;

// DTO (Data Transfer Object) this is where we can put into all the data we got from database (here From Specialist Table)

// and later to use to transport the data back to Controller,

// which will then send the response to the browser/HTTP Response



public class SpecialistDTO {

    private int id;

    private String first_name;

    private String last_name;

    private String email;

    private String speciality;

    private String region;



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getFirst_name() {

        return first_name;

    }



    public void setFirst_name(String first_name) {

        this.first_name = first_name;

    }



    public String getLast_name() {

        return last_name;

    }



    public void setLast_name(String last_name) {

        this.last_name = last_name;

    }



    public String getEmail() {

        return email;

    }



    public void setEmail(String email) {

        this.email = email;

    }



    public String getSpeciality() {

        return speciality;

    }



    public void setSpeciality(String speciality) {

        this.speciality = speciality;

    }



    public String getRegion() {

        return region;

    }



    public void setRegion(String region) {

        this.region = region;

    }

}
