package com.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.dto.UserDto;
import com.userservice.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Log4j2
public class UserController {

	private final UserService userService;

	@GetMapping
	public Flux<UserDto> getAll() {
		log.info("Getting all users");

		return userService.getAll();
	}

	@GetMapping("/{id}")
	public Mono<ResponseEntity<UserDto>> getUserById(@PathVariable Integer id) {
		log.info("Getting user by id {}", id);

		return userService.getUserById(id)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Mono<ResponseEntity<UserDto>> saveUser(@RequestBody Mono<UserDto> userDto) {
		log.info("Saving user {}", userDto);

		return userService.saveUser(userDto)
				.map(ResponseEntity::ok);
	}

	@PutMapping("/{id}")
	public Mono<ResponseEntity<UserDto>> updateUser(
			@PathVariable Integer id,
			@RequestBody Mono<UserDto> userDto) {
		log.info("Updating user with id {}", id);

		return userService.updateUser(id, userDto)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public Mono<ResponseEntity<Void>> deleteUser(@PathVariable Integer id) {
		log.info("Deleting user with id {}", id);

		return userService.deleteUserById(id)
				.map(ResponseEntity::ok);
	}

}
