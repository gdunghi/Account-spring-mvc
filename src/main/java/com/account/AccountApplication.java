package com.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

 
@ComponentScan("com.account.*")
@EnableAutoConfiguration
public class AccountApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AccountApplication.class);
    }

	public static void main(String[] args) {
		 SpringApplication.run(AccountApplication.class, args);

	}
	
	  

}
