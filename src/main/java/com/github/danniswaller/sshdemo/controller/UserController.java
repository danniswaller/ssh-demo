package com.github.danniswaller.sshdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.danniswaller.sshdemo.domain.Role;
import com.github.danniswaller.sshdemo.domain.User;
import com.github.danniswaller.sshdemo.service.UserService;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Controller public class UserController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  // ~ Instance fields
  // --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @return  Boolean
   */
  @RequestMapping("/users/delete")
  @ResponseBody public Boolean delete() {
    Boolean success = true;
    Long    userId  = 1L;

    try {
      userService.delete(userId);
    } catch (Exception e) {
      success = false;
    }

    return success;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   username  keyword String
   *
   * @return  Page
   */
  @RequestMapping("/user/roles")
  @ResponseBody public List<Role> findRolesByUser(String username) {
    List<Role> roles = userService.findRolesByUser(username);

    return roles;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // ~ Methods
  // ----------------------------------------------------------------------------------------------------------
  /**
   * list.
   *
   * @param   keyword    String
   * @param   startPage  Integer
   * @param   pageSize   Integer
   *
   * @return  Page
   */
  @RequestMapping("/users/list")
  @ResponseBody public Page<User> list(String keyword, Integer startPage, Integer pageSize) {
    Page<User> userPage = userService.findByUsername(keyword, new PageRequest(startPage, pageSize));

    return userPage;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   user  User
   *
   * @return  Map
   */
  @RequestMapping(
    value  = "/users/save",
    method = RequestMethod.POST
  )
  @ResponseBody public Boolean save(User user) {
    userService.save(user);

    return true;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @return  Boolean
   */
  @RequestMapping("/users/update")
  @ResponseBody public Boolean update() {
    User user = userService.findById(1L);
    userService.update(user);

    return true;
  }
} // end class UserController
