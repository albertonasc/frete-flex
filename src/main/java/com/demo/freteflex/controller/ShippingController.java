package com.demo.freteflex.controller;

import com.demo.freteflex.controller.dto.ShippingResponse;
import com.demo.freteflex.service.ShippingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping(value = "/shipping/calculate")
    public ResponseEntity<ShippingResponse> calculate(@RequestParam("type") String shippingType,
                                                      @RequestParam("distance") Double distance,
                                                      @RequestParam("weight") Double weight
    ) {

        var cost = shippingService.calculate(shippingType, distance, weight);

        return ResponseEntity.ok(new ShippingResponse(cost));
    }


}
