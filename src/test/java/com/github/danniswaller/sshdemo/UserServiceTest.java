package com.github.danniswaller.sshdemo;

import java.util.List;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.SpringApplicationConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.util.Assert;

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

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * testName.
   *
   * @throws  Exception  exception
   */
  @Test public void testFindAll() throws Exception {
    List<User> users = userService.findAll();
    Assert.notEmpty(users);
    Assert.isTrue(users.size() == 2);
  }
}
