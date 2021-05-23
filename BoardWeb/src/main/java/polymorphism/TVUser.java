package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		/*
		 * 다형성 - 예제
		 * BeanFactory factory = new BeanFactory(); TV tv =
		 * (TV)factory.getBean(args[0]);
		 * 
		 * tv.powerOn(); tv.volumeDown(); tv.volumeUp(); tv.powerOff();
		 */
		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv1 = (TV)factory.getBean("tv");
		tv1.volumeDown();
		tv1.volumeUp();
		tv1.powerOn();
		
		factory.close();
	}

}
