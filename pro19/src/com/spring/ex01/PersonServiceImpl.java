package com.spring.ex01;

public class PersonServiceImpl implements PersonService{

//	private String name; 
	private String irum;
	private int age;
	private String sung;
	
	
	
	



//생성자 매개변수 하나짜리

	public PersonServiceImpl(String irum) {
		
		this.irum = irum;
	}


	
	//생성자 매개변수 두개짜리
	
	public PersonServiceImpl(String irum, int age) {
		
		this.irum = irum;
		this.age = age;
	}

	/*
	 * public PersonServiceImpl(int age, String irum ) {
	 * 
	 * this.irum = irum; this.age = age; }
	 */
	
	
	
	//생성자 매개변수 세개짜리
	
	
	public PersonServiceImpl(String irum, int age, String sung) {
		
		this.irum = irum;
		this.age = age;
		this.sung = sung;
	}
	
	

//	public String getIrum() {
//		return irum;
//	}
//
//
//
//
//	public void setIrum(String irum) {
//		this.irum = irum;
//	}











//	public int getAge() {
//		return age;
//	}
//
//
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}


		
	


	




//	public String getSung() {
//		return sung;
//	}
//
//
//
//
//	public void setSung(String sung) {
//		this.sung = sung;
//	}




	@Override
	public void sayHello() {
		System.out.println("이름 : " + irum);
		System.out.println("나이 : " + age);
		//System.out.println("성별 : " + sung);
		
	}







	








}
