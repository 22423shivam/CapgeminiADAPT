package springpractice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements ApplicationContextAware,BeanNameAware {   
	//ApplicationContextAware,BeanNameAware is used for create a bean name without initialize it in spring.xml and it will intialize before the .xml and after the constructor call.
	Quadrilatreal quadrilatreal;
private ApplicationContext context = null;
	
	public void setQuadrilatreal(Quadrilatreal quadrilatreal) {
		this.quadrilatreal = quadrilatreal;
	}
											// by using getter and setter
public void getQuadrilatreal() {
	if(quadrilatreal == null) 
		System.out.println("Unable to draw");
		else 
			quadrilatreal.start();
}

//application context aware and give name of bean with help of implements
@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	System.out.println("Application context aware line");
	
}
@Override
public void setBeanName(String beanName) {
	System.out.println("The bean name is :" +beanName);
	
}

}