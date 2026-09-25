package com.example.service;

import com.example.dto.UserDTO;
import com.example.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ModelMapper modelMapper;

    @Autowired
    public UserService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDTO convertEntityToDto(User user) {
        // Automatically maps properties with matching names
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    public User convertDtoToEntity(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }
}
