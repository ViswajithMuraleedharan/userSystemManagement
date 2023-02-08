package com.example.User_Management_System.controller;

import com.example.User_Management_System.model.UserManagementSystem;
import com.example.User_Management_System.service.systemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UserManagementSystem/")
public class SystemController {
    private final systemService service;


    public SystemController(systemService service) {
        this.service = service;
    }

    @PostMapping("/add-userManagementSystem")
    public void addUserManagementSystem(@RequestBody UserManagementSystem system){
        systemService.addUserManagementSystem(system);
    }

    @GetMapping("/find-system/name/{name}")
    public UserManagementSystem findSystemByName(@PathVariable String name){
        return systemService.findSystemByName(name);
    }

    @GetMapping("/find-all")
    public List<UserManagementSystem> findAll(){
        return systemService.findAll();
    }

    @PutMapping("update-System/name/{name}")
    public void updateSystems(@PathVariable String name,@RequestBody UserManagementSystem system){
        systemService.updateSystems(name,system);
    }

    @DeleteMapping("delete-System/name/{name}")
    public void deleteSystem(@PathVariable String name){
        systemService.deleteSystem(name);
    }

}
