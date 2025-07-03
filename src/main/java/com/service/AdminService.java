package com.service;

import com.entity.Admin;
import com.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public Admin findById(Integer id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin non trouvé"));
    }

    public void deleteById(Integer id) {
        adminRepository.deleteById(id);
    }
}
