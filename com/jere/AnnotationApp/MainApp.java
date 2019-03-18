package com.jere.AnnotationApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jere.moveclasses.*;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
		
		IceBeam icebeam = context.getBean("iceBeam",IceBeam.class);
		System.out.println(icebeam.getDetails());
		System.out.println(icebeam.getMyStatus().getEffect());
		context.close();
	}

}
