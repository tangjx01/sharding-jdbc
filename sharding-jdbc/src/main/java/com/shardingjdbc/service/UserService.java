package com.shardingjdbc.service;

import java.util.List;

import com.shardingjdbc.entity.User;

public interface UserService {
	
	long insert(User user)  throws Exception;
	
	List<User> queryAll();
}
