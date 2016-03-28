package com.github.danniswaller.sshdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.danniswaller.sshdemo.domain.User;
import com.github.danniswaller.sshdemo.service.UserService;

/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserServiceTest {
  //~ Instance fields --------------------------------------------------------------------------------------------------
	
  //@Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------
	/*
  @Test public void testFindAll() throws Exception {
    List<User> users = userService.findAll();
    Assert.notEmpty(users);
    Assert.isTrue(users.size() == 2);
  }
  */
@Autowired	      private UserService userService;

	@Test
	public void testUserService() {
		User u = new User();
		u.setUsername("张聪");
		u.setPassword("1234");
		u.setEmail("66536600@qq.com");
		userService.save(u);

	}
	      
	   
}
