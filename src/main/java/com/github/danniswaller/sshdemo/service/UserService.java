package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.UserDao;
import com.github.danniswaller.sshdemo.domain.User;

/**
 * TODO: DOCUMENT ME!
 *
 * @author <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version 03/24/2016 18:49
 */
@Component
public class UserService {
	// ~ Instance fields
	// --------------------------------------------------------------------------------------------------

	@Autowired
	private UserDao userDao;

	// ~ Methods
	// ----------------------------------------------------------------------------------------------------------

	public void save(User user) {

		userDao.save(user);
	}

	public User findById(Long id) {
		return userDao.getOne(id);
	}

	public void update(User user) {

		userDao.save(user);
	}

	public void delete(Long userId) {

		userDao.delete(userId);
	}

	/**
   * findAll.
   *
   * @return  List
   */
  public List<User> findAll() {
	 // SELECTI * FROM User where username like '%
    return userDao.findAll();
  }

	public Page<User> findPage(String keyword, Pageable page) {
		return userDao.findByUsername(keyword, page);
	}

}
