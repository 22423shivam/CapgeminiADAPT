package io.org.annote;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext fac = new ClassPathXmlApplicationContext("info.xml");
		Employee e = (Employee)fac.getBean("employee");
		System.out.println(e.toString());

	}

}
