package com.filipeferreira.lombokvsrecords;

import com.filipeferreira.lombokvsrecords.entities.lombokUser.LombokUser;
import com.filipeferreira.lombokvsrecords.entities.recordUser.RecordUser;
import com.filipeferreira.lombokvsrecords.entities.simpleUser.User;
import com.filipeferreira.lombokvsrecords.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class LombokvsrecordsApplicationTests {

	//UserService
	private UserService userService = new UserService();

	//for simple user
	@Test
	void createUserService() {
		var user = new User("filipe", "123", "filipe@email.com");
		userService.create1(user);

		assertEquals(user, userService.getUser(user.getUsername()));
	}

	//for lombok user
	@Test
	void createUserServiceLombok() {
		var lombokUser = LombokUser
				.builder()
				.username("filipe")
				.password("123")
				.email("filipe@email.com")
				.build();
		userService.create2(lombokUser);

		assertEquals(lombokUser, userService.getLombokUser(lombokUser.getUsername()));
	}

	//for record user
	@Test
	void createUserServiceRecord() {
		var recordUser = new RecordUser("filipe", "123", "filipe@email.com");
		userService.create3(recordUser);
	}

	// create invalid record user
	@Test
	void createInvalidRecordUser() {
		assertThrows(IllegalArgumentException.class, () -> {
			var recordUser = new RecordUser(null, "123", "");
			userService.create3(recordUser);
		});
	}
}

