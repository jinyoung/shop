package shop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "customer", url = "${api.url.customer}", fallback = CustomerServiceImpl.class)
public interface CustomerService {
    @RequestMapping(method= RequestMethod.GET, path="/customers/{id}")
    public Customer getCustomer(@PathVariable("id") Long id);
}
