package ru.job4j.introduction;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportUserTest {

	@Test
	public void whenAddUserThenGetIt() {
		 try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml"
	        )) {
			 ImportUser importer = context.getBean("ImportUser", ImportUser.class);
			 User user = new User("test");
			 
			 importer.addUser(user);
			 
			 assert(importer.getAll().contains(user));
		 }
	}

}
