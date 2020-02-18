package random.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcApplication.class, args);
    }
}
