package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.user.impl.UserService;


public class UserServiceClient {
	public static void main(String[] args) {
		//1.Spring �����̳� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring �����̳ʷκ��� userserviceimpl ��ü lookup�Ѵ�
		UserService userService = (UserService)container.getBean("userService");
		
		//3.�α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("jglee");
		vo.setPassword("1");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�. ");
		} else {
			System.out.println("�α��� ����");
		}

		//5. spring �����̳� ����
		container.close();
	}
}
