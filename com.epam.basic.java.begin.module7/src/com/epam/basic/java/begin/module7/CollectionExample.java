package com.epam.basic.java.begin.module7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
	private static Collection createFirstCollection(){
		// Создать коллекцию на основе стандартного класса ArrayList
		Collection <String> col1 = new ArrayList<>();
		// Добавление в коллекцию
		col1.add("string1");
		col1.add("string2");
		col1.add("string3");
		col1.add("string4");
		col1.add("string5");
		col1.add("string6");
		col1.add("string7");
		return col1;
		}
	private static Collection createSecondCollection(){
		// Создать коллекцию на основе стандартного класса ArrayList
		Collection <String> col2 = new ArrayList<>();
		// Добавление в коллекцию
		col2.add("string1");
		col2.add("string2");
		col2.add("string30");
		col2.add("string40");
		col2.add("string50");
		col2.add("string60");
		col2.add("string70");
		return col2;
		}
	
	public static void main(String[] args){
		//Создаем коллекци для демонстрации
		Collection col1 = createFirstCollection();
		Collection col2 = createSecondCollection();
		//Переход по коллекции
		System.out.println("============= Проход по коллекции");
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//проход по коллекции через итератор
		System.out.println("============= Проход через итератор");
		for (Iterator it = col2.iterator(); it.hasNext();){
			String s = (String)it.next();
			System.out.println("Item " + s);
		}
		
		//Проверка содержания элементов коллекции 2 в коллекции 1
		System.out.println("============= Проверка содержания элементов коллекции 2 в коллекции 1");
		if (col1.containsAll(col2)){
			System.out.println("Коллекция 1 содержит все элементы коллекции 2");
		} else{
			System.out.println("Коллекция 1 НЕ содержит все элементы коллекции 2");
		}
		
		//Добавить коллекцию 2 в коллекцию 1
		System.out.println("============= Добавление коллекции 2 в коллекцию 1");
		col1.addAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//Удаление элементов коллекции 2 из коллекции 1
		System.out.println("============= Удаление элементов коллекции 2 из коллекции 1");
		col1.removeAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//Пересоздаем коллекци для демонстрации
		col1 = createFirstCollection();
		col2 = createSecondCollection();
		
		//Удаление элементов коллекции 1, которые есть в коллекции 2
		System.out.println("============= Удаление элементов коллекции 1, которые есть в коллекции 2");
		col1.retainAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//Очистка коллекции 1
		System.out.println("============= Очистка коллекции 1");
		col1.clear();
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		col1 = createFirstCollection();
		
		//Удаление элемента 3 из коллекции 1
		System.out.println("============= Удаление элемента 3 из коллекции 1");
		col1.remove("string3");
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		col1 = createFirstCollection();
		
		//удаление через итератор
		System.out.println("============= Удаление через итератор");
		while (!col1.isEmpty()){
		    Iterator it = col1.iterator(); 
		    Object o = it.next();
			System.out.println("Удаляем " + o);
			it.remove();
		}
		
		
	}

}
