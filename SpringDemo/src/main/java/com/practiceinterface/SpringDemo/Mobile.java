package com.practiceinterface.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile implements Sim{

	public static void main(String[] args) {
//		Sim sim=new Vodafone();
//		sim.calling();
//		sim.data();
//		
//	
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Sim sim2=(Sim) context.getBean("Vodafone");
		sim2.calling();
		sim2 .data();

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}



}
