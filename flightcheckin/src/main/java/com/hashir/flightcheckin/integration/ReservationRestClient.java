package com.hashir.flightcheckin.integration;

import com.hashir.flightcheckin.integration.dto.Reservation;
import com.hashir.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
