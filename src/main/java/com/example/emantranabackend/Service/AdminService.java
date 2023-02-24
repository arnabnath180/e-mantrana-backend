package com.example.emantranabackend.Service;

import com.example.emantranabackend.DTO.DoctorRegistrationRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorResponseDTO;
import com.example.emantranabackend.Repository.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminService {
    private final AdminInterface adminInterface;
    @Autowired
    public AdminService(@Qualifier("admin1") AdminInterface adminInterface) {
        this.adminInterface = adminInterface;
    }
    @Transactional
    public void addDoctor(DoctorRegistrationRequestDTO doctorRegistrationRequestDTO){
        adminInterface.addDoctor(doctorRegistrationRequestDTO);
    }
    @Transactional
    public GetDoctorResponseDTO getDoctor(GetDoctorRequestDTO email){
        GetDoctorResponseDTO getDoctorResponseDTO=adminInterface.getDoctor(email);
        return getDoctorResponseDTO;
    }
}
