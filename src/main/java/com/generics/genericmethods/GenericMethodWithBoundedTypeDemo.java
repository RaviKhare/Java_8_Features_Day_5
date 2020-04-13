package main.java.com.generics.genericmethods;

import main.java.com.model.Glass;
import main.java.com.model.Juice;
import main.java.com.model.OrangeJuice;
import main.java.com.model.Water;

public class GenericMethodWithBoundedTypeDemo{
	
	public static void main(String [] args) {
		
		Glass<Juice> g= new Glass<Juice>();
		Glass<Water> gw = new Glass<Water>();
		
		Glass<OrangeJuice> og = new Glass<OrangeJuice>();
	
		//Glass<AppleJuice> aj = new Glass<AppleJuice>();
	
	}
	
}

