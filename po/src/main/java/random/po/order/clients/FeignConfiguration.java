package random.po.order.clients;

import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class FeignConfiguration {

    @Bean
    public Request.Options timeoutConfiguration() {
        return new Request.Options(5000, 30000);
    }

    @Bean
    public RequestInterceptor requestLoggingInterceptor() {
        return template -> {
            template.header("testHeader", "testHeaderValue");
        };
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 8000, 3);
    }
}
