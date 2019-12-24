package ru.job4j.introduction;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage implements IStorage {
	private List<User> users = new ArrayList<>();
	
	public void add(User user) {
		users.add(user);		
	}
	
	public List<User> getAll() {
		return users;
	}
}
