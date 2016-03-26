package com.github.danniswaller.sshdemo.controller.exception;

/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/26/2016 11:19
 */
public class WebException extends RuntimeException {
  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new WebException object.
   *
   * @param  msg  message String
   */
  public WebException(String msg) {
    super(msg);
  }
}
