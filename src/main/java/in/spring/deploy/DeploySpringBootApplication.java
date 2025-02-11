package in.spring.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeploySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploySpringBootApplication.class, args);
		System.out.println("started........");
	}

}
