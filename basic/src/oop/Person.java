package oop;

public class Person {
	
	String name;
	
	
	Calculator cal;
	
	public Person() {
		
	}
	
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person(Calculator cal) {
		this.cal=cal;
	}
	
	public Person(String name, Calculator cal) {
		this.name=name;
		this.cal=cal;
	}
}
