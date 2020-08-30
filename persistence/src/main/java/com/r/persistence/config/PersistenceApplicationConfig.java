package com.r.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.r.persistence")
@EntityScan(basePackages = "com.r.persistence.entity")
public class PersistenceApplicationConfig {


}
