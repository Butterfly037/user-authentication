package com.prototype.userauthentication.service.impl;

import com.prototype.userauthentication.dto.UserResponseDto;
import com.prototype.userauthentication.entity.User;
import com.prototype.userauthentication.exception.UserNotFoundException;
import com.prototype.userauthentication.repository.UserRepository;
import com.prototype.userauthentication.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        return new UserResponseDto(user.getId(), user.getName());
    }
}
