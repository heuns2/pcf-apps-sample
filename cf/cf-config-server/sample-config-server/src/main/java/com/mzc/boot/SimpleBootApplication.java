package com.mzc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableConfigServer
public class SimpleBootApplication {
	@Autowired
	ConfigServerService service;

	public static void main(String[] args) {
		SpringApplication.run(SimpleBootApplication.class, args);
	}

	@GetMapping("/")
	public String main(){
		return service.configServer();
	}

}


