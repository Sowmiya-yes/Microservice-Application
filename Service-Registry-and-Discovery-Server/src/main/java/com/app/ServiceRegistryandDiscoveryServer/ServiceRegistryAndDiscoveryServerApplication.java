package com.app.ServiceRegistryandDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryAndDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryAndDiscoveryServerApplication.class, args);
	}

}
