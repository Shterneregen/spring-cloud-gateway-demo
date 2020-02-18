package random.po;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import random.po.order.clients.ProductSpecificationRepository;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(clients = ProductSpecificationRepository.class)
public class PoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoApplication.class, args);
    }

    @Bean
    public HttpTraceRepository htttpTraceRepository() {
        return new InMemoryHttpTraceRepository();
    }

    /**
     * Logging
     * <p/>
     * NONE — no logging
     * BASIC — log request method, URL, response code and execution time
     * HEADERS — same as BASIC, plus request & response headers
     * FULL — log headers, body and metadata for request & response
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
