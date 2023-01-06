package com.deploy.kube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubeApplication {
	public static void main(String[] args) {
		SpringApplication.run(KubeApplication.class, args);
		System.out.println("Helm -chart Check...");
		System.out.println("zipkin-check");
	}
}
