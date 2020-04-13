package main.java.com.generics.genericmethods;

import main.java.com.generics.service.OrderedPair;
import main.java.com.generics.service.Pair;
public class GenericMethodDemo {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new OrderedPair<>(1, "USA");
		Pair<Integer, String> p2 = new OrderedPair<>(91, "India");
		boolean result = GenericUtil.compare(p1, p2);
		
	}

}
