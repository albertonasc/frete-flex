package com.demo.freteflex.service;

import com.demo.freteflex.domain.ExpressShippingCalculator;
import com.demo.freteflex.domain.StandardShippingCalculator;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final StandardShippingCalculator standardShippingCalculator;
    private final ExpressShippingCalculator expressShippingCalculator;

    public ShippingService(StandardShippingCalculator standardShippingCalculator, ExpressShippingCalculator expressShippingCalculator) {
        this.standardShippingCalculator = standardShippingCalculator;
        this.expressShippingCalculator = expressShippingCalculator;
    }

    public Double calculate(String shippingTye,
                            Double distance,
                            Double weight) {

        if(shippingTye.equalsIgnoreCase("standard")) {
            return standardShippingCalculator.calculate(distance, weight);
        }

        if(shippingTye.equalsIgnoreCase("express")) {
            return expressShippingCalculator.calculate(distance, weight);
        }

        return null;
    }

}
