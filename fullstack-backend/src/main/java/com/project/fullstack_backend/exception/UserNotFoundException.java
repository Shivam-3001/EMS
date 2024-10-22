package com.project.fullstack_backend.exception;

import java.util.function.Supplier;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("couldn't find the user with id"+ id);
	}

}
