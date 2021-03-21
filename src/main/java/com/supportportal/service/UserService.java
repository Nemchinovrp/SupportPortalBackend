package com.supportportal.service;

import com.supportportal.domain.User;
import com.supportportal.exception.EmailExistException;
import com.supportportal.exception.UserNotFoundException;
import com.supportportal.exception.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
