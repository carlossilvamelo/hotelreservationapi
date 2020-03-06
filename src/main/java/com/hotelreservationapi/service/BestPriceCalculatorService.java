package com.hotelreservationapi.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.hotelreservation.factory.ServiceFactory;
import com.hotelreservation.models.enumeration.CostumerType;
import com.hotelreservation.service.impl.HotelReservationService;
import com.hotelreservation.utils.InputPreProcessingUtil;
import com.hotelreservationapi.models.InputDTO;

@Service
public class BestPriceCalculatorService implements IBestPriceCalculatorService{

	@Override
	public String calculateBestHotel(InputDTO inputDTO) {
		
		HotelReservationService hotelReservationService = ServiceFactory.getHotelReservationService();
		CostumerType costumerType = inputDTO.getCostumerType();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(costumerType.name());
		stringBuilder.append(":");
		//Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
		for (LocalDate date : inputDTO.getDates()) {
			stringBuilder.append(String.format("%d%s%d(%s)", date.getDayOfMonth()
					,InputPreProcessingUtil.getMounthName(date.getMonth().getValue()), date.getYear(), date.getDayOfWeek().name()));
			stringBuilder.append(",");
		}
		List<String> hotelNames = hotelReservationService.calculateBestHotelPrice(Arrays.asList(stringBuilder.toString()));
		
		return hotelNames.get(0);
	}

}
