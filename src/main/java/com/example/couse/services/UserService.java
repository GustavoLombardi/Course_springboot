package com.example.couse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.couse.entities.User;
import com.example.couse.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	public User findByiD(long id ) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}