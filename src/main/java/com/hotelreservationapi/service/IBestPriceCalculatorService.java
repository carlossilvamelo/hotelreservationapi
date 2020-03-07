package com.hotelreservationapi.service;

import java.util.List;

import com.hotelreservation.models.Hotel;
import com.hotelreservationapi.models.InputDTO;

public interface IBestPriceCalculatorService {

	public List<Hotel> calculateBestHotel(InputDTO inputDTO);

}
