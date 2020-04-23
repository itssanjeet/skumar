package com.sk.skumar.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sk.skumar.model.User;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 3;

	static {
		users.add(new User(1, "Kumar", new Date()));
		users.add(new User(2, "Sanjeet", new Date()));
		users.add(new User(3, "Mahto", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(Integer id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User deleteById(int id) {
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			User user = it.next();
			if (user.getId() == id) {
				it.remove();
				return user;
			}
		}
		return null;
	}
}
