package com.spring.ex1;

public class Board {
	public void board() {
		
		String msg = "�Խù� ���";
		
		Login.login(msg); // static�޼���� Ŭ�����̸����� ȣ�� // ������
		System.out.println(msg + "�ϱ�"); //�ٽɱ��
		Logout.logout(msg); // ������
		
	}
}
