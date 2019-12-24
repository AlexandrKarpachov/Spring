package ru.job4j.introduction;

import java.util.List;

public class ImportUser {
	private IStorage storage;

	public ImportUser(IStorage storage) {
		this.storage = storage;
	}
	
	public void addUser(User user) {
		storage.add(user);
	}
	
	public List<User> getAll() {
		return storage.getAll();
	}
}
