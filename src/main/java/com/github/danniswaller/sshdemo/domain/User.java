package com.github.danniswaller.sshdemo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;

import org.springframework.stereotype.Component;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Entity public class User {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    name             = "disabled",
    nullable         = false,
    columnDefinition = "char(1) default 'N'"
  )
  @Type(type = "yes_no")
  private boolean disabled = true; // 是否禁用
  private String  email;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;
  private String   password;


  @JoinTable(
    name               = "UserRole",
    joinColumns        = { @JoinColumn(name = "userId") },
    inverseJoinColumns = { @JoinColumn(name = "roleId") },
    uniqueConstraints  = { @UniqueConstraint(columnNames = { "userId", "roleId" }) }
  )
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Role> roles = new ArrayList<Role>();

  private String username;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new User object.
   */
  public User() { }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for email.
   *
   * @return  String
   */
  public String getEmail() {
    return email;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * getter method for password.
   *
   * @return  String
   */
  public String getPassword() {
    return password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for roles.
   *
   * @return  List
   */
  public List<Role> getRoles() {
    return roles;
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
   * getter method for disabled.
   *
   * @return  boolean
   */
  public boolean isDisabled() {
    return disabled;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for disabled.
   *
   * @param  disabled  boolean
   */
  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for email.
   *
   * @param  email  String
   */
  public void setEmail(String email) {
    this.email = email;
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
   * setter method for password.
   *
   * @param  password  String
   */
  public void setPassword(String password) {
    this.password = password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for roles.
   *
   * @param  roles  List
   */
  public void setRoles(List<Role> roles) {
    this.roles = roles;
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
