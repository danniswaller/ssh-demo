package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.ProductDirDao;
import com.github.danniswaller.sshdemo.domain.ProductDir;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Component public class ProductDirService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ProductDirDao productDirDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  id  Long
   */
  public void delete(Long id) {
    productDirDao.delete(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  public List<ProductDir> findAll() {
    return productDirDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  ProductDir
   */
  public ProductDir findByName(String name) {
    return productDirDao.findByName(name);

  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for one.
   *
   * @param   id  Long
   *
   * @return  ProductDir
   */
  public ProductDir getOne(Long id) {
    return productDirDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  productDir  ProductDir
   */
  public void save(ProductDir productDir) {
    productDirDao.save(productDir);
  }
} // end class ProductDirService
