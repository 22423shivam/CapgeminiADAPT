package springpractice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingAppMain {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //add abstract for the intilaizing and disbosable
			context.registerShutdownHook();   // it is use to initializing and dispose the beans
					Triangle tri = context.getBean("tri",Triangle.class); // it will fetch value from spring.xml
					tri.draw();			//object made by constructor
					Circle cir = context.getBean("cir",Circle.class); // it will fetch value from spring.xml
					cir.getQuadrilatreal();  //object made by getter and setter
					
					
			}

}
