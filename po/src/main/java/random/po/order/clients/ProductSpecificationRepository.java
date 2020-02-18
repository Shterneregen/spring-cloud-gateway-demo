package random.po.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "pc", url = "${pcurl}")
public interface ProductSpecificationRepository {

    @RequestMapping(method = RequestMethod.GET, path = "/catalog/{specificationId}")
    Object existsById(@PathVariable("specificationId") String specificationId);
}
