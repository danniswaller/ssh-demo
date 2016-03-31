package com.github.danniswaller.sshdemo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.github.danniswaller.sshdemo.domain.Role;
import com.github.danniswaller.sshdemo.domain.User;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
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

  // ----------------------------------------------------------------------------------------------------------
  /**
   * findByUsername.
   *
   * @param   name  String
   *
   * @return  User
   */
  User findByUsername(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByUsername.
   *
   * @param   username  String
   * @param   page      Pageable
   *
   * @return  Page
   */
  Page<User> findByUsername(String username, Pageable page);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findRolesByUser.
   *
   * @param   username  String
   *
   * @return  List
   */
  List<Role> findRolesByUser(String username);
} // end interface UserDao
