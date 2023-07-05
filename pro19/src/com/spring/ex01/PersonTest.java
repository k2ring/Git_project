package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory; // 스프링 빈 컨테이너에 접근하기 위한 최상위 인터페이스
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource; // 스프링에서 java.io.File 대체

public class PersonTest {

	public static void main(String[] args) {
		
		//기존 방식
		
//		PersonServiceImpl person1=new PersonServiceImpl();
//		person1.setName("홍길동");		
//		person1.sayHello();
		
		
		// 스프링의 DI (의존성 주입) 방식
		
		//이름을 setter를 이용하지만 이 클래스를 객체를 만들어서 하는것이 아닌 주입하는 방식
		//PersonServiceImpl person=new PersonServiceImpl(); 이 과정이 없어짐
		//홍길동이란 이름동 설정파일에서 주입해줌
		//person.setName("홍길동");	
		
		
		//스프링에서는 BeanFactory와 이를 상속한 ApplicationContext 두 가지 유형의 컨테이너르르 제공
		//BeanFactory는 스프링 설정파일(person.xml)에 등록된 bean 객체를 생성하고 관리하는
		//가장 기본적인 컨테이너 기능만 제공, 실제 BeanFactory를 사용할 일은 없다.
		
		BeanFactory factory	=new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		PersonService person2=(PersonService) factory.getBean("personService");
		
		person2.sayHello();
		
		
		
	}

}
