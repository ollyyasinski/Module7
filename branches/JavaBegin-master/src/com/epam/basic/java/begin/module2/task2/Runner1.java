package com.epam.basic.java.begin.module2.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner1 {

	public static void main(String[] args) {
		List<BusStop> busStops = new ArrayList<>();
		
		BusStop bs1 = new BusStop();
		bs1.name = "Bus stop 1";
		BusStop bs2 = new BusStop();
		bs2.name = "Bus stop 2";
		BusStop bs3 = new BusStop();
		bs3.name = "Bus stop 3";
		BusStop bs4 = new BusStop();
		bs4.name = "Bus stop 4";
		BusStop bs5 = new BusStop();
		bs5.name = "Bus stop 5";
		Human human1 = new Human();
		human1.haveDog = true;
		human1.name = "Vasya";
		Human human2 = new Human();
		human2.haveDog = false;
		human2.name = "Roma";
		Human human3 = new Human();
		human3.haveDog = false;
		human3.name = "Misha";
		Human human4 = new Human();
		human4.haveDog = false;
		human4.name = "Dima";
		Human human5 = new Human();
		human5.haveDog = false;
		human5.name = "Petya";
		
		Dog dog = new Dog();
		dog.name = "Sharik";
	
		busStops.add(bs1);
		busStops.add(bs2);
		busStops.add(bs3);
		busStops.add(bs4);
		busStops.add(bs5);
		Bus bus = new Bus(busStops);
		bus.add(human1, dog);
		bus.move();
		
		bus.move();
		bus.move();
		bus.remove(human1, dog);
	}

}
