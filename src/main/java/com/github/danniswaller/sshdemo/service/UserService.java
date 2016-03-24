package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.UserDao;
import com.github.danniswaller.sshdemo.domain.User;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@Component public class UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserDao userDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * findAll.
   *
   * @return  List
   */
  public List<User> findAll() {
    return userDao.findAll();
  }


}
