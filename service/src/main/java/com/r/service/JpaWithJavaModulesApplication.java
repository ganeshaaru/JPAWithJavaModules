package com.r.service;

import com.r.persistence.config.PersistenceApplicationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@SpringBootApplication
@Import(PersistenceApplicationConfig.class)
public class JpaWithJavaModulesApplication {
	private  static final Logger LOGGER = LoggerFactory.getLogger(JpaWithJavaModulesApplication.class);

	@Autowired
    private MessageService messageService;

  public static void main(String[] args) {

      ApplicationContext context = SpringApplication.run(JpaWithJavaModulesApplication.class, args);

      MessageService messageService = (MessageService) context.getBean("messageService");
	  LOGGER.info("Printing messages");
	  messageService.getMessages();

	  LOGGER.info("Create Messages");
	  messageService.createMessage("New Message");

      LOGGER.info("Printing messages");
      messageService.getMessages();

  }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
