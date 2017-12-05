package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		//Object construction
		Employee eRef = new Employee();
		eRef.setEname("John Watson");
		eRef.setEname("John Watson");
		eRef.setEaddress("Readwood Shores");
		System.out.println("Employee Details: "+eRef);
//Spring way of Ioc
	//Resource resource = new ClassPathResource("employeebean.xml");
	//BeanFactory factory = new XmlBeanFactory(resource);
	
	ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
	
	//Employee e1 = factory.getBean("emp",Employee.class);
	//Employee e2 = factory.getBean("emp2",Employee.class);
	
	Employee e1 = context.getBean("emp",Employee.class);
	Employee e2 = context.getBean("emp2",Employee.class);
	System.out.println("Employee1 Details: " +e1);
	System.out.println("Employee2 Details: " +e2);
	
	
			
	}

}
