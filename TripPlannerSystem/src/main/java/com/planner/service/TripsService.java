package com.planner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.planner.model.Trips;

@Service
public interface TripsService {

	public void addTrips(Trips trips);
	public List<Trips> getAllTrips();
	public Trips getTripsById(int tripId);
	public void updateTrips(Trips trips);
	public void deleteTrips(int tripId);
	public Trips validateTrips(Trips trips);
}
