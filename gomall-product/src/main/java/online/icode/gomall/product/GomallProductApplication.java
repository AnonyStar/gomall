package online.icode.gomall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GomallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GomallProductApplication.class, args);
	}

}
