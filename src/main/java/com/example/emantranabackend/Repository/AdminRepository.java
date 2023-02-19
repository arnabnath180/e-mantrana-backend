package com.example.emantranabackend.Repository;

import com.example.emantranabackend.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Optional<Admin> findByUserId(String userId);
}
