package ru.job4j.introduction;

import java.util.List;

public interface IStorage {
	void add(User user);
	List<User> getAll();
}
