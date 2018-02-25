package cn.fanstar.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(EurekaServerApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
