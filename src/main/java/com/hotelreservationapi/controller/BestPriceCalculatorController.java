package com.hotelreservationapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hotelreservationapi.models.InputDTO;
import com.hotelreservationapi.service.IBestPriceCalculatorService;

@RestController
@RequestMapping("/hotels")
public class BestPriceCalculatorController {

	@Autowired
	private IBestPriceCalculatorService iBestPriceCalculatorService;
	
	@PostMapping("best-price")
	public String calculateBestHotelName(@RequestBody(required = true) InputDTO inputDTO) {

		return iBestPriceCalculatorService.calculateBestHotel(inputDTO);
	}
}
