package com.planner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.model.Trips;
import com.planner.repository.TripsRepository;

@Service
public class TripsServiceImpl implements TripsService {

	@Autowired
	TripsRepository tripsRepository;
	
	@Override
	public void addTrips(Trips trips) {
		// TODO Auto-generated method stub
		tripsRepository.save(trips);
	}

	@Override
	public List<Trips> getAllTrips() {
		
		List<Trips> tripsList =  tripsRepository.findAll();
		return tripsList;
	}

	@Override
	public Trips getTripsById(int tripId) {
		// TODO Auto-generated method stub
		Trips trips = tripsRepository.getById(tripId);
		return trips;
	}

	@Override
	public void updateTrips(Trips trips) {
		// TODO Auto-generated method stub
		tripsRepository.save(trips);

	}

	@Override
	public void deleteTrips(int tripId) {
		// TODO Auto-generated method stub
		tripsRepository.deleteById(tripId);
	}

	@Override
	public Trips validateTrips(Trips trips) {
		// TODO Auto-generated method stub
		Trips trips1 = tripsRepository.findByLoginData(trips.getfrom(),trips.getto());
		return trips1;
	}

}
