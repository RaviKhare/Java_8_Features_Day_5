package main.java.com.model;

public class Glass<T extends  Juice & Liquid> {
	
	private T liquid;
	
	public String getLiquidTaste() {
		return liquid.taste();
	}
	


}
