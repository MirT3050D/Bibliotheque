package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Admin;
import com.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public Admin create(@RequestBody Admin admin) {
        return adminService.save(admin);
    }

    @GetMapping
    public List<Admin> getAll() {
        return adminService.findAll();
    }

    @GetMapping("/{id}")
    public Admin getById(@PathVariable Integer id) {
        return adminService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        adminService.deleteById(id);
    }
}
