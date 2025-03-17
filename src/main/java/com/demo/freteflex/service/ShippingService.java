package com.demo.freteflex.service;

import com.demo.freteflex.domain.StandardShippingCalculator;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final StandardShippingCalculator standardShippingCalculator;

    public ShippingService(StandardShippingCalculator standardShippingCalculator) {
        this.standardShippingCalculator = standardShippingCalculator;
    }

    public Double calculate(String shippingTye,
                            Double distance,
                            Double weight) {

        if(shippingTye.equalsIgnoreCase("standard")) {
            return standardShippingCalculator.calculate(distance, weight);
        }

        return 0.0;
    }

}
