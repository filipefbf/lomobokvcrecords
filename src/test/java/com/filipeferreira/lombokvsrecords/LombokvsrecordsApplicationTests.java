package com.filipeferreira.lombokvsrecords;

import com.filipeferreira.lombokvsrecords.entities.simpleUser.User;
import com.filipeferreira.lombokvsrecords.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LombokvsrecordsApplicationTests {

	//UserService
	private UserService userService = new UserService();

	@Test
	void createUserService() {
		var user = new User("filipe", "123", "filipe@email.com");
		userService.create(user);

		assertEquals(user, userService.getUser(user.getUsername()));
	}

}
