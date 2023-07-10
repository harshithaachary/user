package com.project.service;

import com.project.dtos.SignupDTO;
import com.project.dtos.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
