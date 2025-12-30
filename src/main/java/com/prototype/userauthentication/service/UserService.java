package com.prototype.userauthentication.service;

import com.prototype.userauthentication.dto.UserResponseDto;

public interface UserService {

    UserResponseDto getUserById(Long id);
}
