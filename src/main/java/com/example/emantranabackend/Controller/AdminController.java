package com.example.emantranabackend.Controller;

import com.example.emantranabackend.DTO.DoctorRegistrationRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorRequestDTO;
import com.example.emantranabackend.DTO.GetDoctorResponseDTO;
import com.example.emantranabackend.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/e-mantrana/api/admin")
@RestController
@CrossOrigin
public class AdminController {
    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(value = "/add_doctor")
    public void addDoctor(@RequestBody DoctorRegistrationRequestDTO doctor){

        adminService.addDoctor(doctor);
    }
    @GetMapping(value = "/get_doctor/{email}")
    public GetDoctorResponseDTO getDoctor(@PathVariable("email") String email){
        System.out.println(email.getClass());
        GetDoctorRequestDTO getDoctorRequestDTO=new GetDoctorRequestDTO(email);
        GetDoctorResponseDTO getDoctorResponseDTO=adminService.getDoctor(getDoctorRequestDTO);
        return getDoctorResponseDTO;
    }
}

