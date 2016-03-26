package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Component;

import org.springframework.util.StringUtils;

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

  // ~ Instance fields
  // --------------------------------------------------------------------------------------------------

  @Autowired private UserDao userDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * count.
   *
   * @param   keyword  String
   *
   * @return  Integer
   */
  public Long count(String keyword) {
    return StringUtils.hasText(keyword) ? userDao.countByUsername(keyword) : userDao.count();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  userId  Long
   */
  public void delete(Long userId) {
    userDao.delete(userId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  public List<User> findAll() {
    // SELECTI * FROM User where username like '%
    return userDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findById.
   *
   * @param   id  Long
   *
   * @return  User
   */
  public User findById(Long id) {
    return userDao.getOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   keyword  String
   * @param   page     Pageable
   *
   * @return  Page
   */
  public Page<User> list(String keyword, Pageable page) {
    return StringUtils.hasText(keyword) ? userDao.findByUsername(keyword, page) : userDao.findAll(page);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // ~ Methods
  // ----------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  user  User
   */
  public void save(User user) {
    userDao.save(user);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  user  User
   */
  public void update(User user) {
    userDao.save(user);
  }
} // end class UserService
