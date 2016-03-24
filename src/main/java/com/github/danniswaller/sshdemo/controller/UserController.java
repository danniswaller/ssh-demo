package com.github.danniswaller.sshdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.danniswaller.sshdemo.service.UserService;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@Controller public class UserController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * list.
   *
   * @return  Map
   */
  @RequestMapping("/users/list")
  @ResponseBody public Map<String, Object> list() {
    return new HashMap<String, Object>() {
      {
        put("users", userService.findAll());
      }
    };
  }
}
