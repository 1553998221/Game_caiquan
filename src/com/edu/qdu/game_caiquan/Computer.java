package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Computer extends Player{
	String name;
	Scanner input = new Scanner(System.in);
	//�����෽����д
	public String inputName(){
		System.out.println("��ѡ��Է���ɫ��1������   2����Ȩ   3���ܲ٣���");
		int sel = input.nextInt();
		switch (sel) {
		case 1:
			setPlayerName("����");
			break;
		case 2:
			setPlayerName("��Ȩ");
			break;
		case 3:
			setPlayerName("�ܲ�");
			break;

		default:
			break;
		}
		return getPlayerName();
	}
	public String myFist(){
		setNum((int)(Math.random()*3+1)); 
		switch (getNum()) {
		case 1:
			setFist("����");
			break;
		case 2:
			setFist("ʯͷ");
			break;
		case 3:
			setFist("��");
			break;

		default:
			break;
		}
		return getFist();
	}
	

	
}

