package com.github.danniswaller.sshdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.danniswaller.sshdemo.domain.ProductDir;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/31/2016 19:16
 */
public interface ProductDirDao extends JpaRepository<ProductDir, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  ProductDir
   */
  ProductDir findByName(String name);


}
