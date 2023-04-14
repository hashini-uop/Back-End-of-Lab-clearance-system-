package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.Dto.LoginDTO;
import com.system.labClearanceSystem.Dto.UserDTO;
import com.system.labClearanceSystem.response.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDto);

    LoginResponse loginUser(LoginDTO loginDTO);
}
