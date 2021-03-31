package io.org.javaBrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class DrawingApp {
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)fac.getBean("triangle");
		int e = triangle.draw(2);
		System.out.println(e);
		}
}
