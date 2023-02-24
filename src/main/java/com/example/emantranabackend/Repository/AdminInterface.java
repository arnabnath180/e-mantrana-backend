package com.example.emantranabackend.Repository;

import com.example.emantranabackend.DTO.DoctorRegistrationRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorResponseDTO;

public interface AdminInterface {
    boolean addDoctor(DoctorRegistrationRequestDTO doctor);
    GetDoctorResponseDTO getDoctor(GetDoctorRequestDTO email);
}
