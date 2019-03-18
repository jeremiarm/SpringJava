package com.jere.JavaConfigApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jere.moveclasses.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SkillConfig.class);
		
		IceBeam icebeam = context.getBean("iceBeam",IceBeam.class);
		System.out.println(icebeam.getDetails());
		System.out.println(icebeam.getMyStatus().getEffect());
		System.out.println(icebeam.toString());
		
		
		
		context.close();
	}

}
