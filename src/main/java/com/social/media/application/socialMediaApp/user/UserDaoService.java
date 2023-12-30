package com.social.media.application.socialMediaApp.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Rohan", LocalDate.now().minusYears(32)));
		users.add(new User(++usersCount, "Ankit", LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount, "Priya", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Bittu", LocalDate.now().minusYears(27)));
		users.add(new User(++usersCount, "Shona", LocalDate.now().minusYears(24)));
	}
	
	public List<User> findAllUser(){
		return users;
	}

	public User findOneUser(int id) {
		Predicate<User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User createUser(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public void deleteUser(int id) {
		Predicate<User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
}
