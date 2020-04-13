package main.java.com.generics;

import main.java.com.model.Box;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Box<Integer> boxInteger  = new Box<>();
		boxInteger.setT(10);
		boxInteger.getT();
		
		Box<String> boxString  = new Box<>();
		boxString.setT("Hello");
		boxString.getT();
		
	}

}
