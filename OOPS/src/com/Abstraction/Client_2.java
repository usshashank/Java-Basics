package com.Abstraction;

public class Client extends Abst{
	void run() {
		System.out.println("Abstracting");
	}
	public static void main(String[] args)
	{
		Client obj = new Client();
		obj.run();
	}
}
