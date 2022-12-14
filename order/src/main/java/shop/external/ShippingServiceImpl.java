package shop.external;

import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {


    /**
     * Fallback
     */
    public Shipping getShipping(Long id) {
        Shipping shipping = new Shipping();
        return shipping;
    }
}
