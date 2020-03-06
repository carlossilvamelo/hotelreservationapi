package com.hotelreservationapi.service;

import com.hotelreservationapi.models.InputDTO;

public interface IBestPriceCalculatorService {

	public String calculateBestHotel(InputDTO inputDTO);
}
