package com.github.danniswaller.sshdemo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.github.danniswaller.sshdemo.domain.User;


public interface UserDao extends JpaRepository<User, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * countByUsername.
   *
   * @param   keyword  String
   *
   * @return  Integer
   */
  Long countByUsername(String keyword);

 
	// ----------------------------------------------------------------------------------------------------------
	/**
	 * findByUsername.
	 *
	 * @param name
	 *            String
	 *
	 * @return User
	 */
	User findByUsername(String name);
   
	Page<User> findByUsername(String username, Pageable page);

 
} // end interface UserDao
