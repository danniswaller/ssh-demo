package com.github.danniswaller.sshdemo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@Controller public class NaviController {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * toUserPage.
   *
   * @return  String
   */
  @RequestMapping("/users")
  public String toUserPage() {
    return "users";
  }

}
