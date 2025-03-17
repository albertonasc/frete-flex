package com.demo.freteflex.controller;

import com.demo.freteflex.controller.dto.ShippingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping(value = "/shipping/calculate")
    public ResponseEntity<ShippingResponse> calculate(@RequestParam("type") String shippingType,
                                                      @RequestParam("distance") Double distance,
                                                      @RequestParam("weight") Double weight
    ) {

        // TODO - calculo do frete


        return ResponseEntity.ok(new ShippingResponse(0.0));
    }


}
