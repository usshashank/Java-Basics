package com.Inheritance;

public class Client extends Work{
	int bonus = 10000;
	public static void main(String[] args){
		Client p = new Client();
		System.out.println("Programmers Salary "+p.salary);
		System.out.println("Bonus of Programmer "+p.bonus);
	}
}
