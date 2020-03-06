package com.hotelreservationapi.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.hotelreservation.models.enumeration.CostumerType;

public class InputDTO implements Serializable {

	private static final long serialVersionUID = 8238851263912013846L;

	private CostumerType costumerType;
	private List<LocalDate> dates;

	public CostumerType getCostumerType() {
		return costumerType;
	}

	public void setCostumerType(CostumerType costumerType) {
		this.costumerType = costumerType;
	}

	public List<LocalDate> getDates() {
		return dates;
	}

	public void setDates(List<LocalDate> dates) {
		this.dates = dates;
	}

}
