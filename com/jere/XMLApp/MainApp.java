package com.jere.XMLApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jere.moveclasses.*;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BasicXML.xml");
		
		IceBeam icebeam = context.getBean("myMove_1",IceBeam.class);
		System.out.println(icebeam.getDetails());
		System.out.println(icebeam.getMyStatus().getEffect());
		context.close();
	}

}
