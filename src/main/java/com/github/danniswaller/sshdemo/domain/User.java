package com.github.danniswaller.sshdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:49
 */
@Entity public class User {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;
  private String   username;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new User object.
   */
  public User() { }

  /**
   * Creates a new User object.
   *
   * @param  name  String
   */
  public User(String name) {
    this.username = name;
  }

  /**
   * Creates a new User object.
   *
   * @param  id    Long
   * @param  name  String
   */
  public User(Long id, String name) {
    this.id       = id;
    this.username = name;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for username.
   *
   * @return  String
   */
  public String getUsername() {
    return username;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for username.
   *
   * @param  username  String
   */
  public void setUsername(String username) {
    this.username = username;
  }

} // end class User
