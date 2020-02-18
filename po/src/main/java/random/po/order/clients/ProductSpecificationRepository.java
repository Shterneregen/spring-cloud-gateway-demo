package random.po.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "pc", configuration = FeignConfiguration.class)
public interface ProductSpecificationRepository {

    @GetMapping(path = "/catalog/{specificationId}")
    Object existsById(@PathVariable("specificationId") String specificationId);
}
