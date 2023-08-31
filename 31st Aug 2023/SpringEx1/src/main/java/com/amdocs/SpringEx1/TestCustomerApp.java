package com.amdocs.SpringEx1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCustomerApp {

	public static void main(String[] args) {

		/*Resource resc= new ClassPathResource("applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resc);*/

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer customer=(Customer) context.getBean(Customer.class);
		System.out.println(customer.toString());
		
	}

}
