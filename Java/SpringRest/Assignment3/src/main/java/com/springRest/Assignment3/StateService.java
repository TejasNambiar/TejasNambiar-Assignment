package com.springRest.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StateService {
	private Map<Long, State> states = Database.getStates();

	public StateService() {
		states.put(99501L, new State("AK", "ANCHORAGE", "US"));
		states.put(522007L, new State("AP", "GUNTUR", "INDIA"));

	}

	public List<State> getAllStates() {
		return new ArrayList<State>(states.values());
	}

	public State getState(Long zipCode) {
		return states.get(zipCode);

	}

}