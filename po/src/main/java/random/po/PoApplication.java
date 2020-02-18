package random.po;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import random.po.order.clients.ProductSpecificationRepository;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(clients = ProductSpecificationRepository.class)
public class PoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoApplication.class, args);
    }
}
