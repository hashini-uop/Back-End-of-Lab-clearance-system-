package com.system.labClearanceSystem.controller;

import com.system.labClearanceSystem.Dto.LoginDTO;
import com.system.labClearanceSystem.Dto.UserDTO;
import com.system.labClearanceSystem.response.LoginResponse;
import com.system.labClearanceSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user") //jpa
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDto){
        String id = userService.addUser(userDto);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
