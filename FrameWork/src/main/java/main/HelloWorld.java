package main;

public class HelloWorld {

	public static void main(String[] args) {
		
		Calcurator cal = new Calcurator();
		System.out.println(cal.add(10, 12));
	}
	
	public String getHello() {
		return "Maven Hello World";
	}

}
