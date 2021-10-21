package com.flight.service;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.dao.UserDao;
import com.flight.entities.User;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordIsEmptyException;
import com.flight.exceptions.RecordNotFoundException;
import com.flight.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRepository userRepository;

	Logger logger = LoggerFactory.getLogger(UserService.class);

	/**
	 * This function is used to add user to database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return ResponseEntity
	 * @version 1.0
	 * @throws RecordAlreadyPresentException
	 * @since 29-10-2020
	 */
	@Override
	public ResponseEntity<?> createUser(User u) throws RecordAlreadyPresentException {
		logger.trace("createUser method accessed in UserServiceImpl");

		if (!checkIfUserAlreadyPresent(u)) {
			User user = new User(u.getUserType(), u.getUserName(), u.getUserPassword(), u.getUserPhone(), u.getEmail());
			user = userDao.addUser(user);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} else {
			throw new RecordAlreadyPresentException("User with Id: " + u.getUserId() + " already exists!! or user with same email exists");
		}

	}

	/**
	 * This function is used to update user details to database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return ResponseEntity
	 * @version 1.0
	 * @throws RecordNotFoundException
	 * @since 29-10-2020
	 */
	@Override
	public ResponseEntity<?> updateUser(User u) throws RecordNotFoundException {
		logger.trace("updateUser method accessed in UserServiceImpl");
		if (userDao.viewUserById(u.getUserId()).isPresent()) {
			if(checkIfUserAlreadyPresent(u))
			{
				throw new RecordAlreadyPresentException("email already used by other user");
			}
			userDao.updateUser(u);
			return new ResponseEntity<User>(u, HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("User with Id: " + u.getUserId() + " doesn't exist!!");
		}

	}

	/**
	 * This function is used to view user present in the database by id
	 * 
	 * @author amitabh
	 * @param User object
	 * @return ResponseEntity
	 * @version 1.0
	 * @throws RecordNotFoundException
	 * @since 29-10-2020
	 */
	@Override
	public ResponseEntity<?> viewUserById(BigInteger id) throws RecordNotFoundException {
		logger.trace("viewUserById method accessed in UserServiceImpl");

		if (userDao.viewUserById(id).isPresent()) {
			User u = userDao.viewUserById(id).get();
			return new ResponseEntity<User>(u, HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("User with Id: " + id + " doesn't exist!!");
		}

	}

	/**
	 * @author amitabh
	 * @param User object
	 * @return string valid or not
	 * @version 1.0
	 * @throws RecordNotFoundException
	 * @since 29-10-2020
	 */
	@Override
	public boolean validateUser(User u) throws RecordNotFoundException {
		logger.trace("validateUser method accessed in UserServiceImpl");
		User testUser = null;
		if (userDao.viewUserById(u.getUserId()).isPresent()) {
			testUser = userRepository.getOne(u.getUserId());
			if (testUser.equals(u))
				return true;
		}

		return false;
	}

	/**
	 * This function is used to get all users present in the database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return List of users present in the database
	 * @version 1.0
	 * @throws RecordIsEmptyException
	 * @since 29-10-2020
	 */
	@Override
	public List<User> displayAllUsers() throws RecordIsEmptyException {
		logger.trace("displayAllUsers method accessed in UserServiceImpl");
		if (userDao.displayAllUsers().isEmpty()) {
			throw new RecordIsEmptyException("empty list");
		}
		return userDao.displayAllUsers();
	}

	/**
	 * This function is used to delete a user from the database
	 * 
	 * @author amitabh
	 * @param UserId of type BigInteger
	 * @return will return if user is deleted or not from the databse in form of
	 *         string
	 * @version 1.0
	 * @throws RecordNotFoundException
	 * @since 29-10-2020
	 */
	@Override
	public String deleteUser(BigInteger id) throws RecordNotFoundException {
		logger.trace("deleteUser method accessed in UserServiceImpl");
		if (userDao.viewUserById(id).isPresent()) {
			userDao.deleteUser(userDao.viewUserById(id).get());
			return "User Deleted!!";
		} else {
			throw new RecordNotFoundException("User not found for the entered UserID");
		}
	}

	/**
	 * This function is used to delete a user from the database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return will return if user is already present in the databse or not will
	 *         check on the basis of emailid of user
	 * @version 1.0
	 * @since 29-10-2020
	 */
	public boolean checkIfUserAlreadyPresent(User u) {
		List<User> listUsers = userDao.displayAllUsers();
		for (User user : listUsers) {
			if (user.getEmail().equals(u.getEmail()) && u.getUserId()!= user.getUserId()) {
				return true;
			}
		}

		return false;

	}
}
