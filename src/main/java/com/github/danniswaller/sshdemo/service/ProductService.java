package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.ProductDao;
import com.github.danniswaller.sshdemo.domain.Product;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
@Component public class ProductService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ProductDao dao;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ProductService object.
   */
  public ProductService() { }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  public List<Product> findAll() {
    List<Product> products = dao.findAll();

    return products;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findById.
   *
   * @param   id  Long
   *
   * @return  Product
   */
  public Product findById(Long id) {
    Product p = dao.findOne(id);

    return p;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  Product
   */
  public Product findByName(String name) {
    return dao.findByName(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  p  Product
   */
  public void save(Product p) {
    dao.save(p);
  }
} // end class ProductService
