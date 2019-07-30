package main;

public class Calcurator {

	public double add(double a, double b) {
		return a+b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}

	public double mul(double a, double b) {
		return a*b;
	}

	public double div(double a, double b) throws Exception {
		if(b==0) {
			throw new Exception("do not");
		}
		return a/b;
	}
}
