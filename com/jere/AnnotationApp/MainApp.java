package com.jere.AnnotationApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jere.moveclasses.*;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
		
		IceBeam icebeam = context.getBean("iceBeam",IceBeam.class);
		ThunderWave thunderwave = context.getBean("thunderWave",ThunderWave.class);
		DarkVoid darkvoid = context.getBean("darkVoid",DarkVoid.class);
		System.out.println(icebeam.getDetails());
		System.out.println(icebeam.getMyStatus().getEffect());
		System.out.println(thunderwave.getDetails());
		System.out.println(thunderwave.getMyStatus().getEffect());
		System.out.println(darkvoid.getDetails());
		System.out.println(darkvoid.getMyStatus().getEffect());
		context.close();
	}

}
