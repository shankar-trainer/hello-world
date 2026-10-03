package com.userservice.util;

import com.userservice.dto.UserDto;
import com.userservice.entity.UserEntity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserMapper {

	public static UserDto toDto(UserEntity entity) {
		UserDto mapped = UserDto.builder()
				.id(entity.getId())
				.name(entity.getName())
				.balance(entity.getBalance())
				.build();

		log.info("Mapped entity {} to dto {}", entity, mapped);

		return mapped;
	}

	public static UserEntity toEntity(UserDto dto) {
		UserEntity mapped = UserEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.balance(dto.getBalance())
				.build();

		log.info("Mapped dto {} to entity {}", dto, mapped);

		return mapped;
	}

}
