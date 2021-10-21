package com.flight.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.User;
import com.flight.repositories.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository userRepo;

	Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	/**
	 * This function is used to add user to database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return User object
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public User addUser(User u) {
		logger.trace("addUser method accessed in UserDaoImpl");
		return userRepo.save(u);
	}

	/**
	 * This function is used to update user details to database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return User object
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public User updateUser(User u) {
		logger.trace("updateUser method accessed in UserDaoImpl");
		return userRepo.save(u);
	}

	/**
	 * This function is used to view user present in the database by id
	 * 
	 * @author amitabh
	 * @param User object
	 * @return Optiona<User> object
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public Optional<User> viewUserById(BigInteger id) {
		logger.trace("viewUserById method accessed in UserDaoImpl");
		return userRepo.findById(id);
	}

	/**
	 * This function is used to get all users present in the database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return List of users present in the database
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public List<User> displayAllUsers() {
		logger.trace("displayAllUsers method accessed in UserDaoImpl");
		return userRepo.findAll();
	}

	/**
	 * @author amitabh
	 * @param User object
	 * @return string valid or not
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public User validateUser(User u) {
		logger.trace("validateUser method accessed in UserDaoImpl");
		return viewUserById(u.getUserId()).get();
	}

	/**
	 * This function is used to delete a user from the database
	 * 
	 * @author amitabh
	 * @param User object
	 * @return will return true if user is deleted or not from the databse in form of
	 *         boolean
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public boolean deleteUser(User u) {
		logger.trace("deleteUser method accessed in UserDaoImpl");
		 userRepo.deleteById(u.getUserId());
		 return true;
	}

}
