package com.example.emantranabackend.DTO;

import java.util.ArrayList;
import java.util.List;

public class GetDoctorResponseDTO {
    private String fname;
    private String lname;
    private String type;
    private String email;

    private String ph_number;
    private int patient_count;


    public GetDoctorResponseDTO() {
    }

    public GetDoctorResponseDTO(String fname, String lname, String type, String email, String ph_number, int patient_count) {
        this.fname = fname;
        this.lname = lname;
        this.type = type;
        this.email = email;
        this.ph_number = ph_number;
        this.patient_count = patient_count;
    }

    public GetDoctorResponseDTO(String fname, String lname, String type, String email, String ph_number) {
        this.fname = fname;
        this.lname = lname;
        this.type = type;
        this.email = email;
        this.ph_number = ph_number;
    }

    public int getPatient_count() {
        return patient_count;
    }

    public void setPatient_count(int patient_count) {
        this.patient_count = patient_count;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_number() {
        return ph_number;
    }

    public void setPh_number(String ph_number) {
        this.ph_number = ph_number;
    }
}
