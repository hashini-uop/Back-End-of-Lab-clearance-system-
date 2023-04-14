package com.system.labClearanceSystem.service;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.system.labClearanceSystem.Dto.LoginDTO;
import com.system.labClearanceSystem.Dto.UserDTO;
import com.system.labClearanceSystem.entity.User;
import com.system.labClearanceSystem.repository.UserRepository;
import com.system.labClearanceSystem.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFName(),
                userDto.getLName(),
                userDto.getEmail(),

                this.passwordEncoder.encode(userDto.getPassword())
        );

        userRepository.save(user);
        return user.getFName();



    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepository.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodePassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodePassword);
            if (isPwdRight) {
                Optional<User> user = userRepository.findByEmailAndPassword(loginDTO.getEmail(), encodePassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);

                } else {
                    return new LoginResponse("Login Failed ", false);
                }

            } else {
                return new LoginResponse("Password Not match ", false);
            }
        }else {
            return new LoginResponse("Email not exist" , false);
    }
    }
}
