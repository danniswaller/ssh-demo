package com.github.danniswaller.sshdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:44
 */
@SpringBootApplication public class Application extends SpringBootServletInitializer {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * main.
   *
   * @param  args  String[]
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.boot.context.web.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
   */

  @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(Application.class);

  }

} // end class Application
