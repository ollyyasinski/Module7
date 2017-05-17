package com.epam.basic.java.begin.module2.task2;

import java.util.ArrayList;
import java.util.List;

public class Bus {

	List<BusStop> busStops = new ArrayList<BusStop>();

	int currentBusStopIndex = 0;

	public Bus(List<BusStop> stops) {
		busStops = stops;
	}

	public void move() {
		BusStop currentStop = busStops.get(currentBusStopIndex);
		int nextBusStopIndex = currentBusStopIndex + 1;
		BusStop nextStop = busStops.get(nextBusStopIndex);
		System.out.println("Move from " + currentStop.name + " to " + nextStop.name);
		currentBusStopIndex = nextBusStopIndex;

	}

	public void add(Human human, Dog dog) {
		if (human.haveDog == true) {
			System.out.println(human.name + " and his dog " + dog.name + " gets on the bus at " + busStops.get(currentBusStopIndex).name);
		} else {
			System.out.println(human.name + " gets on the bus at " + busStops.get(currentBusStopIndex).name);
		}
	}

	public void remove(Human human, Dog dog) {
		if (human.haveDog == true) {
			System.out.println(human.name + " and his dog " + dog.name + " gets off the bus at " + busStops.get(currentBusStopIndex).name);
		} else {
			System.out.println(human.name + " gets off the bus at " + busStops.get(currentBusStopIndex).name);
		}
	}

}
