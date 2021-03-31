package springpractice;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	Quadrilatreal quadrilatreal;
	
	public Triangle(Quadrilatreal quadrilatreal )
	{
		this.quadrilatreal = quadrilatreal;  		// by using constructor
	}
public void draw() {

if(quadrilatreal == null) 
	System.out.println("Unable to draw");
	else 
		quadrilatreal.start();

}
//initialize and destroy the whole beans with help of implements
@Override
public void destroy() throws Exception {
	System.out.println("Destroy whole beans after execution");	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Intialize the bean of triangle");
	
}

// another method to initialize and destroy the bean without implement and with help of xml file
public void init(){
	System.out.println("Intialize beans with help of init");
}
public void clean() {
	System.out.println("Destroy the bean after execution with help of destroy");
}
}