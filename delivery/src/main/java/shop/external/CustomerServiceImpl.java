package shop.external;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    /**
     * Fallback
     */
    public Customer getCustomer(Long id) {
        Customer customer = new Customer();
        return customer;
    }
}
