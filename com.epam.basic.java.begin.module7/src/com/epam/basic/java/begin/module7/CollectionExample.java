package com.epam.basic.java.begin.module7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
	private static Collection createFirstCollection(){
		// ������� ��������� �� ������ ������������ ������ ArrayList
		Collection <String> col1 = new ArrayList<>();
		// ���������� � ���������
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
		// ������� ��������� �� ������ ������������ ������ ArrayList
		Collection <String> col2 = new ArrayList<>();
		// ���������� � ���������
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
		//������� �������� ��� ������������
		Collection col1 = createFirstCollection();
		Collection col2 = createSecondCollection();
		//������� �� ���������
		System.out.println("============= ������ �� ���������");
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//������ �� ��������� ����� ��������
		System.out.println("============= ������ ����� ��������");
		for (Iterator it = col2.iterator(); it.hasNext();){
			String s = (String)it.next();
			System.out.println("Item " + s);
		}
		
		//�������� ���������� ��������� ��������� 2 � ��������� 1
		System.out.println("============= �������� ���������� ��������� ��������� 2 � ��������� 1");
		if (col1.containsAll(col2)){
			System.out.println("��������� 1 �������� ��� �������� ��������� 2");
		} else{
			System.out.println("��������� 1 �� �������� ��� �������� ��������� 2");
		}
		
		//�������� ��������� 2 � ��������� 1
		System.out.println("============= ���������� ��������� 2 � ��������� 1");
		col1.addAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//�������� ��������� ��������� 2 �� ��������� 1
		System.out.println("============= �������� ��������� ��������� 2 �� ��������� 1");
		col1.removeAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//����������� �������� ��� ������������
		col1 = createFirstCollection();
		col2 = createSecondCollection();
		
		//�������� ��������� ��������� 1, ������� ���� � ��������� 2
		System.out.println("============= �������� ��������� ��������� 1, ������� ���� � ��������� 2");
		col1.retainAll(col2);
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		//������� ��������� 1
		System.out.println("============= ������� ��������� 1");
		col1.clear();
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		col1 = createFirstCollection();
		
		//�������� �������� 3 �� ��������� 1
		System.out.println("============= �������� �������� 3 �� ��������� 1");
		col1.remove("string3");
		for (Object o : col1){
			System.out.println("Item " + o);
		}
		
		col1 = createFirstCollection();
		
		//�������� ����� ��������
		System.out.println("============= �������� ����� ��������");
		while (!col1.isEmpty()){
		    Iterator it = col1.iterator(); 
		    Object o = it.next();
			System.out.println("������� " + o);
			it.remove();
		}
		
		
	}

}
