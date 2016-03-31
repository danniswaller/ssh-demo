package com.github.danniswaller.sshdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Entity public class ProductDir {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String englishName; // 英文名称

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;    // 唯一标识
  private String   intro; // 分类简介
  private String   name;  // 分类的中文名称

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for english name.
   *
   * @return  String
   */
  public String getEnglishName() {
    return englishName;
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
   * getter method for intro.
   *
   * @return  String
   */
  public String getIntro() {
    return intro;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for english name.
   *
   * @param  englishName  String
   */
  public void setEnglishName(String englishName) {
    this.englishName = englishName;
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
   * setter method for intro.
   *
   * @param  intro  String
   */
  public void setIntro(String intro) {
    this.intro = intro;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }

} // end class ProductDir
