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
   * @param   model  ModelMap
   *
   * @return  String
   */
  @RequestMapping("/home")
  public String home(Map<String, Object> model) {
    model.put("time", new Date());
    model.put("message", "demo msg");

    return "home";
  }

} // end class NaviController
