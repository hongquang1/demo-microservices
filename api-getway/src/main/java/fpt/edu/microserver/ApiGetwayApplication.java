package fpt.edu.microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGetwayApplication.class, args);
	}

}
