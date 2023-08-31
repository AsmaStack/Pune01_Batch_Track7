package com.amdocs.SpringAnnotationEx.BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amdocs.SpringAnnotationEx.ComponentAnnotation.CollegeConfig;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		// Getting the bean
		College college = context.getBean("collegeBean", College.class);

		// Invoking the method
		// inside main() method
		college.test();
	}

}
