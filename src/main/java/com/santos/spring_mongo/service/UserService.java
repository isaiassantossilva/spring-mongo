package com.santos.spring_mongo.service;

import com.santos.spring_mongo.dto.UserDTO;
import com.santos.spring_mongo.entity.User;
import com.santos.spring_mongo.mapper.UserMapper;
import com.santos.spring_mongo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void create(UserDTO userDTO) {
        log.info("Saving user: {}", userDTO);
        User user = this.userMapper.toUser(userDTO);
        this.userRepository.save(user);
    }
}
