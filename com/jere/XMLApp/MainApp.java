package com.jere.XMLApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jere.moveclasses.*;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BasicXML.xml");
		
		IceBeam icebeam = context.getBean("myMove_1",IceBeam.class);
		ThunderWave thunderwave = context.getBean("myMove_2",ThunderWave.class);
		DarkVoid darkvoid = context.getBean("myMove_3",DarkVoid.class);
		System.out.println(icebeam.getDetails());
		System.out.println(thunderwave.getDetails());
		System.out.println(darkvoid.getDetails());
		System.out.println(icebeam.getMyStatus().getEffect());
		System.out.println(thunderwave.getMyStatus().getEffect());
		System.out.println(darkvoid.getMyStatus().getEffect());
		System.out.println(icebeam.toString());
		System.out.println(thunderwave.toString());
		System.out.println(darkvoid.toString());
		context.close();
	}

}
