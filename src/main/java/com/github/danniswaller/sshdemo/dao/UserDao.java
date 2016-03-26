package com.github.danniswaller.sshdemo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.github.danniswaller.sshdemo.domain.User;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   username  String
   * @param   page      Pageable
   *
   * @return  Page
   */
  Page<User> findByUsername(String username, Pageable page);
} // end interface UserDao
