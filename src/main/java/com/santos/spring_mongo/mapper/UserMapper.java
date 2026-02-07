package com.santos.spring_mongo.mapper;

import com.santos.spring_mongo.dto.UserDTO;
import com.santos.spring_mongo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    User toUser(UserDTO userDTO);
}
