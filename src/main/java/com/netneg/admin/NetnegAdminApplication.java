package com.netneg.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.netneg.admin.dao")
public class NetnegAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetnegAdminApplication.class, args);
	}

}
