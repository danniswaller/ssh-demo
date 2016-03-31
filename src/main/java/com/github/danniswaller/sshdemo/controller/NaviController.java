package com.github.danniswaller.sshdemo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.github.danniswaller.sshdemo.controller.exception.WebException;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@Controller public class NaviController {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * handleMyRuntimeException.
   *
   * @param   exception  MyException
   *
   * @return  MyRestResponse
   */
  @ExceptionHandler(WebException.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResponseEntity handleMyRuntimeException(WebException exception) {
    return ResponseEntity.badRequest().body(exception.getMessage());
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toUserPage.
   *
   * @param   model  Map
   *
   * @return  String
   */
  @RequestMapping("/home")
  public String home(Map<String, String> model) {
    model.put("currentPage", "home");

    return "home";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * user.
   *
   * @param   model  Map
   *
   * @return  String
   */
  @RequestMapping("/role")
  public String role(Map<String, String> model) {
    model.put("currentPage", "role");

    return "role";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * user.
   *
   * @param   model  Map
   *
   * @return  String
   */
  @RequestMapping("/user")
  public String user(Map<String, String> model) {
    model.put("currentPage", "user");

    return "user";
  }

} // end class NaviController
