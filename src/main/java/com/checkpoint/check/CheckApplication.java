package com.checkpoint.check;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class CheckApplication extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(CheckApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(CheckApplication.class, args);
//	}
//}
@MapperScan("com.checkpoint.check.*.dao")
@SpringBootApplication
@EnableCaching
public class CheckApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CheckApplication.class, args);
	}
}
