package com.devyounes.sampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleserviceApplication.class, args);
	}

}


@RestController
class WsTesting{

	@GetMapping("/hello.do")
	public String hello(){
		return "Hello docker";
	}
}