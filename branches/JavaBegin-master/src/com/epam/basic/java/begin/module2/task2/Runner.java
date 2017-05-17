package com.epam.basic.java.begin.module2.task2;

public class Runner {
	
	public static void main(String[] args){
		Bus bus1 = new Bus();
	
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
			
		
		bus1.move(bs1);
		bus1.stop(bs2);
		bus1.add(human1, dog, bs2);
		bus1.move(bs2);
		bus1.stop(bs4);
		bus1.remove(human1, dog, bs4);
		bus1.add(human2, dog, bs4);
		bus1.add(human3, dog, bs4);
		bus1.add(human4, dog, bs4);
		bus1.add(human5, dog, bs4);
		bus1.move(bs4);
		bus1.stop(bs5);
		bus1.remove(human2, dog, bs5);
		bus1.remove(human3, dog, bs5);
		bus1.remove(human4, dog, bs5);
		bus1.remove(human5, dog, bs5);
		bus1.move(bs5);
		
	}
}

