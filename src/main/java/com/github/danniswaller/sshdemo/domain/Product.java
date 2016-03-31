package com.github.danniswaller.sshdemo.domain;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Entity public class Product {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String     bigPic;              // 商品大图
  private BigDecimal costPrice;           // 成本价格
  private Long       dir_id;              // 商品分类
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long   id;                  // 唯一标识
  private Date       inputDate;           // 上架时间
  private String     intro;               // 商品简介
  private BigDecimal marketPrice;         // 市场价格
  private String     model;               // 规格:长,宽,高
  private String     name;                // 中文名字
  private Integer    num;                 // 库存
  private String     place;               // 生产地
  @Column(
    name             = "recommended",
    nullable         = false,
    columnDefinition = "char(1) default 'N'"
  )
  @Type(type = "yes_no")
  private boolean    recommended = false; // 是否推荐
  private BigDecimal salePrice;           // 自己零售价格
  private String     smallPic;            // 商品小图
  private String     sn;                  // 商品编号
  private Integer    status;              // 上架1,下架0
  private Integer    viewTimes;           // 浏览的次数

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for big pic.
   *
   * @return  String
   */
  public String getBigPic() {
    return bigPic;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for cost price.
   *
   * @return  BigDecimal
   */
  public BigDecimal getCostPrice() {
    return costPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for dir id.
   *
   * @return  Long
   */
  public Long getDir_id() {
    return dir_id;
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
   * getter method for input date.
   *
   * @return  Date
   */
  public Date getInputDate() {
    return inputDate;
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
   * getter method for market price.
   *
   * @return  BigDecimal
   */
  public BigDecimal getMarketPrice() {
    return marketPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for model.
   *
   * @return  String
   */
  public String getModel() {
    return model;
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
   * getter method for num.
   *
   * @return  Integer
   */
  public Integer getNum() {
    return num;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for place.
   *
   * @return  String
   */
  public String getPlace() {
    return place;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for sale price.
   *
   * @return  BigDecimal
   */
  public BigDecimal getSalePrice() {
    return salePrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for small pic.
   *
   * @return  String
   */
  public String getSmallPic() {
    return smallPic;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for sn.
   *
   * @return  String
   */
  public String getSn() {
    return sn;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for status.
   *
   * @return  Integer
   */
  public Integer getStatus() {
    return status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for view times.
   *
   * @return  Integer
   */
  public Integer getViewTimes() {
    return viewTimes;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for recommended.
   *
   * @return  boolean
   */
  public boolean isRecommended() {
    return recommended;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for big pic.
   *
   * @param  bigPic  String
   */
  public void setBigPic(String bigPic) {
    this.bigPic = bigPic;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for cost price.
   *
   * @param  costPrice  BigDecimal
   */
  public void setCostPrice(BigDecimal costPrice) {
    this.costPrice = costPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for dir id.
   *
   * @param  dir_id  Long
   */
  public void setDir_id(Long dir_id) {
    this.dir_id = dir_id;
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
   * setter method for input date.
   *
   * @param  inputDate  Date
   */
  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
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
   * setter method for market price.
   *
   * @param  marketPrice  BigDecimal
   */
  public void setMarketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for model.
   *
   * @param  model  String
   */
  public void setModel(String model) {
    this.model = model;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for num.
   *
   * @param  num  Integer
   */
  public void setNum(Integer num) {
    this.num = num;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for place.
   *
   * @param  place  String
   */
  public void setPlace(String place) {
    this.place = place;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for recommended.
   *
   * @param  recommended  boolean
   */
  public void setRecommended(boolean recommended) {
    this.recommended = recommended;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for sale price.
   *
   * @param  salePrice  BigDecimal
   */
  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for small pic.
   *
   * @param  smallPic  String
   */
  public void setSmallPic(String smallPic) {
    this.smallPic = smallPic;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for sn.
   *
   * @param  sn  String
   */
  public void setSn(String sn) {
    this.sn = sn;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for status.
   *
   * @param  status  Integer
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for view times.
   *
   * @param  viewTimes  Integer
   */
  public void setViewTimes(Integer viewTimes) {
    this.viewTimes = viewTimes;
  }


} // end class Product
