package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
	/*
		  Login li = new Login(); 
		  li.login();
		  
		  OrderImpl oi = new OrderImpl(); 
		  oi.order();
		  
		  Dao d = new Dao(); 
		  d.dao();
		  
		  Logout lo = new Logout(); 
		  lo.logout();
	*/
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("-----------��ǰ �ֹ��ϱ�------------");
		Order oi = (Order) context.getBean("oi");	
		oi.order(); //�ٽɱ��
	
		System.out.println("-----------�Խù� ����ϱ�-----------");
		Board board = (Board) context.getBean("board");
		board.board();
	}
}
