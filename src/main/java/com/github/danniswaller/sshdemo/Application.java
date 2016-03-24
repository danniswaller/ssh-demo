package com.github.danniswaller.sshdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.github.danniswaller.sshdemo.dao.UserDao;
import com.github.danniswaller.sshdemo.domain.User;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version  03/24/2016 18:44
 */
@SpringBootApplication public class Application {
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
   * demo.
   *
   * @param   userDao  UserDao
   *
   * @return  CommandLineRunner
   */
  @Bean public CommandLineRunner demo(final UserDao userDao) {
    return new CommandLineRunner() {
      @Override public void run(String... arg0) throws Exception {
        userDao.save(new User("tom"));
        userDao.save(new User("cat"));

      }

    };

  }

} // end class Application
