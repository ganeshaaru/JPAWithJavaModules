package com.r.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.r.persistence")
@EntityScan(basePackages = "com.r.persistence.entity")
public class PersistenceApplicationConfig {

  /* @Bean
  public DataSource dataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore");
      dataSource.setUsername("root");
      dataSource.setPassword("Titan^2017");

      return dataSource;
  }*/

}
