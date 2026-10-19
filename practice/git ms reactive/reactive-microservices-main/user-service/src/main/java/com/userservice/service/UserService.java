package com.userservice.service;

import org.springframework.stereotype.Service;

import com.userservice.dto.UserDto;
import com.userservice.repository.UserRepository;
import com.userservice.util.UserMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Log4j2
public class UserService {

	private final UserRepository userRepository;

	public Flux<UserDto> getAll() {
		Flux<UserDto> userList = userRepository.findAll()
				.map(UserMapper::toDto)
				.doOnError(e -> log.error("Error getting users", e));

		return userList;
	}

	public Mono<UserDto> getUserById(Integer id) {
		Mono<UserDto> product = userRepository.findById(id)
				.map(UserMapper::toDto)
				.doOnError(e -> log.error("Error getting user", e));

		return product;
	}

	public Mono<UserDto> saveUser(Mono<UserDto> userDto) {
		Mono<UserDto> saved = userDto
				.map(UserMapper::toEntity)
				.flatMap(userRepository::save)
				.map(UserMapper::toDto)
				.doOnError(e -> log.error("Error saving product", e));

		return saved;
	}

	public Mono<UserDto> updateUser(Integer id, Mono<UserDto> userDto) {
		Mono<UserDto> updated = userRepository.findById(id)
				.flatMap(p -> userDto
						.map(UserMapper::toEntity)
						.flatMap(userRepository::save)
						.map(UserMapper::toDto)
						.doOnError(e -> log.error("Error updating product", e)));

		return updated;
	}

	public Mono<Void> deleteUserById(Integer id) {
		Mono<Void> deleted = userRepository.deleteById(id)
				.doOnError(e -> log.error("Error deleting product", e));

		return deleted;
	}

}
