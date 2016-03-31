package com.github.danniswaller.sshdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.danniswaller.sshdemo.domain.Product;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
public interface ProductDao extends JpaRepository<Product, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  Product
   */
  Product findByName(String name);


}
