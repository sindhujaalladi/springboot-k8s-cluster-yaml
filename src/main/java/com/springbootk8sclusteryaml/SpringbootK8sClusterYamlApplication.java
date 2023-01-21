package com.springbootk8sclusteryaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sClusterYamlApplication {
	
	
	@GetMapping("/runImageusingyaml")
	public String runImageusingyamlconfiguration() {
		return "application successfully uploaded in POD container and successfullt deployed in kubernetes cluster";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sClusterYamlApplication.class, args);
	}

}
